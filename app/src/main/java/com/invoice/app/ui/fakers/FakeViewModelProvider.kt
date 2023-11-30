package com.invoice.app.ui.fakers

import com.invoice.app.data.Resource
import com.invoice.app.ui.auth.AuthViewModel
import com.invoice.app.ui.auth.home.customers.CustomersViewModel
import com.invoice.app.ui.auth.home.invoices.InvoicesViewModel
//import com.invoice.app.ui.auth.home.mybusinesses.MyBusinessesViewModel
//import com.invoice.app.ui.auth.home.taxes.TaxesViewModel
import com.invoice.app.data.home.CustomersRepository
import com.invoice.app.data.home.InvoiceRepository
import com.invoice.app.data.models.Business
import com.invoice.app.data.models.Customer
import com.invoice.app.data.models.Invoice
import com.invoice.app.data.models.Tax
import com.google.firebase.auth.FirebaseUser
import com.invoice.app.data.auth.AuthRepository

/*
* Currently there is a problem with *Jetpack Compose Preview* & *Hilt*
* Jetpack compose is not able to inject using hiltViewModel() to generate Compose Previews
* In future when both these libraries will be compatible, we can remove this object
* But for now, to see preview, we can use this FakeViewModelProvider
* */
object FakeViewModelProvider {

    fun provideInvoicesViewModel() = InvoicesViewModel(invoiceRepo, customersRepo)

    fun provideCustomersViewModel() = CustomersViewModel(customersRepo)

    fun provideAuthViewModel() = AuthViewModel(authRepo)


    private val invoiceRepo = object : InvoiceRepository {
        override suspend fun getInvoices(): Resource<List<Invoice>> {
            TODO("Not yet implemented")
        }

        override suspend fun addInvoice(invoice: Invoice): Resource<Invoice> {
            TODO("Not yet implemented")
        }

        override suspend fun updateInvoice(invoice: Invoice): Resource<Invoice> {
            TODO("Not yet implemented")
        }

        override suspend fun deleteInvoice(id: String): Resource<Boolean> {
            TODO("Not yet implemented")
        }

        override suspend fun updatePaidState(id: String, isPaid: Boolean): Resource<Boolean> {
            TODO("Not yet implemented")
        }

    }



    private val customersRepo = object : CustomersRepository {
        override suspend fun getCustomers(): Resource<List<Customer>> {
            TODO("Not yet implemented")
        }

        override suspend fun addCustomer(customer: Customer): Resource<Customer> {
            TODO("Not yet implemented")
        }

        override suspend fun updateCustomer(customer: Customer): Resource<Customer> {
            TODO("Not yet implemented")
        }

        override suspend fun deleteCustomer(id: String): Resource<Boolean> {
            TODO("Not yet implemented")
        }

    }



    private val authRepo = object : AuthRepository {
        override val currentUser: FirebaseUser?
            get() = null

        override suspend fun login(email: String, password: String): Resource<FirebaseUser> {
            TODO("Not yet implemented")
        }

        override suspend fun signup(name: String, email: String, password: String): Resource<FirebaseUser> {
            TODO("Not yet implemented")
        }

        override fun logout() {
            TODO("Not yet implemented")
        }

    }
}