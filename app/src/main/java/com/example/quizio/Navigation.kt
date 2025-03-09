package com.example.quizio

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.quizio.screens.HomeView
import com.example.quizio.screens.LoginScreen
import com.example.quizio.screens.RegisterScreen

@Composable
fun NavigationGraph(
    navController: NavHostController
){
    NavHost(navController = navController, startDestination = Screen.LoginScreen.route){
        composable(Screen.LoginScreen.route) {
            LoginScreen(navController)
        }
        composable(Screen.RegisterScreen.route) {
            RegisterScreen(navController)
        }
        composable(Screen.HomeView.route) {
            HomeView(navController = navController)
        }
    }
}