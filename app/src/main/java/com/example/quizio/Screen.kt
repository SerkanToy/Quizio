package com.example.quizio

sealed class Screen(val route : String) {
    object LoginScreen : Screen("signin")
    object RegisterScreen : Screen("signup")
    object HomeView : Screen("home")
}