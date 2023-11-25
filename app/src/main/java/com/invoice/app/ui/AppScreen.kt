package com.invoice.app.ui

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.invoice.app.R

sealed class AppScreen(@StringRes val title: Int, @DrawableRes val icon: Int, val route: String) {

    object Auth : AppScreen(R.string.app_name, R.drawable.ic_app_logo, "nav_auth") {
        object Login : AppScreen(R.string.login, R.drawable.ic_app_logo, "login")
        object Signup : AppScreen(R.string.signup, R.drawable.ic_app_logo, "signup")
    }
     object Customers : AppScreen(R.string.customers, R.drawable.ic_customers, "nav_customers") {
        object Home : AppScreen(R.string.customers, R.drawable.ic_customers, "customers")
        object ManageCustomer : AppScreen(R.string.add_customer, R.drawable.ic_customers, "manage_customer")
    }


    object Logout : AppScreen(R.string.logout, R.drawable.ic_logout, "logout")
}
