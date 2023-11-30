package com.invoice.app.data.home

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.invoice.app.data.BaseRepository
import com.invoice.app.data.Resource
import com.invoice.app.data.models.Business
import com.invoice.app.data.utils.await
import com.invoice.app.data.utils.currentDateTime
import javax.inject.Inject

class MyBusinessRepositoryImpl @Inject constructor(
    auth: FirebaseAuth,
    firestore: FirebaseFirestore
) : MyBusinessRepository, BaseRepository<Business>(auth, firestore, DB_MY_BUSINESSES) {

    override suspend fun getMyBusinesses(): Resource<List<Business>> {
        return try {
            val snapshot = db.get().await()
            Resource.Success(getData(snapshot, Business::class.java))
        } catch (e: Exception) {
            Resource.Failure(e)
        }
    }

    override suspend fun canAddBusiness(): Boolean {
        return db.get().await().size() < MAX_ALLOWED_BUSINESS
    }

    override suspend fun addMyBusiness(business: Business): Resource<Business> {
        return try {
            db.add(business).await()
            Resource.Success(business)
        } catch (e: Exception) {
            Resource.Failure(e)
        }
    }

    override suspend fun updateMyBusiness(business: Business): Resource<Business> {
        return try {
            business.updatedAt = currentDateTime
            db.document(business.id).set(business).await()
            Resource.Success(business)
        } catch (e: Exception) {
            Resource.Failure(e)
        }
    }

    override suspend fun deleteMyBusiness(id: String): Resource<Boolean> {
        return try {
            db.document(id).delete().await()
            Resource.Success(true)
        } catch (e: Exception) {
            Resource.Failure(e)
        }
    }

    companion object {
        private const val DB_MY_BUSINESSES = "my_businesses"
        private const val MAX_ALLOWED_BUSINESS = 5
    }
}