package mx.edu.utez.examenuii.ui

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import mx.edu.utez.examenuii.ui.screens.LoginScreen
import mx.edu.utez.examenuii.ui.screens.PetScreen
import mx.edu.utez.examenuii.ui.screens.OwnerScreen
import mx.edu.utez.examenuii.viewmodel.LoginViewModel
import mx.edu.utez.examenuii.viewmodel.OwnerViewModel

@Composable
fun Navigation() {
    val navController = rememberNavController()

    val loginViewModel: LoginViewModel = viewModel()
    val ownerViewModel: OwnerViewModel = viewModel()

    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            throw Exception("Fallo la aplicación! ¿Por qué? " +
                    "porque genere una excepción con throw, ¿Que hacer? " +
                    "elimina la linea que genra la excepción")
            LoginScreen(loginViewModel, navController)
        }
        composable("owner") {
            OwnerScreen(ownerViewModel, navController)
        }
        composable("pet") {
            PetScreen(ownerViewModel, navController)
        }
    }
}