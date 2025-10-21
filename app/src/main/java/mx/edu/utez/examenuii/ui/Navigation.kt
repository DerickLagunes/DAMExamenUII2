package mx.edu.utez.examenuii.ui

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import mx.edu.utez.examenuii.ui.screens.LoginScreen
import mx.edu.utez.examenuii.ui.screens.PassportScreen
import mx.edu.utez.examenuii.ui.screens.StampScreen
import mx.edu.utez.examenuii.viewmodel.PassportViewModel
import mx.edu.utez.examenuii.viewmodel.LoginViewModel

@Composable
fun Navigation() {
    val navController = rememberNavController()

    val loginViewModel: LoginViewModel = viewModel()
    val passportViewModel: PassportViewModel = viewModel()

    NavHost(navController = navController, startDestination = "iniciarSesion") {
        composable("login") {
            LoginScreen(loginViewModel, navController)
        }
        composable("passport") {
            PassportScreen(passportViewModel, navController)
        }
        composable("stamp") {
            StampScreen(passportViewModel, navController)
        }
    }
}