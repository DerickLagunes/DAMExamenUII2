package mx.edu.utez.examenuii.ui

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import mx.edu.utez.examenuii.ui.screens.LoginScreen
import mx.edu.utez.examenuii.ui.screens.PassportScreen
import mx.edu.utez.examenuii.viewmodel.PassportViewModel
import mx.edu.utez.examenuii.viewmodel.LoginViewModel

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "incubadora") {
        composable("login") {
            val viewModel: LoginViewModel = viewModel()
            LoginScreen(viewModel, navController)
        }
        composable("passport") {
            val viewModel: PassportViewModel = viewModel()
            PassportScreen(viewModel, navController)
        }
    }
}