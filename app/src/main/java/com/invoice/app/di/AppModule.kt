package com.invoice.app.di

import com.google.firebase.auth.FirebaseAuth
<<<<<<< HEAD
=======
import com.google.firebase.firestore.FirebaseFirestore
import com.invoice.app.data.*
import com.invoice.app.data.auth.AuthRepository
import com.invoice.app.data.auth.AuthRepositoryImpl
import com.invoice.app.data.home.CustomersRepository
import com.invoice.app.data.home.CustomersRepositoryImpl
import com.invoice.app.data.home.DashboardRepository
import com.invoice.app.data.home.DashboardRepositoryImpl
import com.invoice.app.data.home.InvoiceRepository
import com.invoice.app.data.home.InvoiceRepositoryImpl
>>>>>>> d636427a8f2d7e5eec5a103d21702805d1d2b212
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
<<<<<<< HEAD
import com.invoice.app.data.auth.AuthRepositoryImpl
import com.invoice.app.data.*
import com.invoice.app.data.home.CustomersRepository
import com.invoice.app.data.home.CustomersRepositoryImpl
import com.invoice.app.data.home.InvoiceRepository
import com.invoice.app.data.home.InvoiceRepositoryImpl
import com.google.firebase.firestore.FirebaseFirestore
import com.invoice.app.data.auth.AuthRepository
=======
>>>>>>> d636427a8f2d7e5eec5a103d21702805d1d2b212

@InstallIn(SingletonComponent::class)
@Module
class AppModule {

    @Provides
    fun provideFirebaseAuth(): FirebaseAuth = FirebaseAuth.getInstance()

    @Provides
    fun provideFirebaseDb(): FirebaseFirestore = FirebaseFirestore.getInstance()

    @Provides
    fun provideAuthRepository(impl: AuthRepositoryImpl): AuthRepository = impl


    @Provides
    fun provideCustomersRepository(impl: CustomersRepositoryImpl): CustomersRepository = impl

<<<<<<< HEAD
    @Provides
    fun provideInvoiceRepository(impl: InvoiceRepositoryImpl): InvoiceRepository = impl


=======

    @Provides
    fun provideInvoiceRepository(impl: InvoiceRepositoryImpl): InvoiceRepository = impl

    @Provides
    fun provideDashboardRepository(impl: DashboardRepositoryImpl): DashboardRepository = impl
>>>>>>> d636427a8f2d7e5eec5a103d21702805d1d2b212
}