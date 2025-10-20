package mx.edu.utez.examenuii.ui.screens

import mx.edu.utez.examenuii.ui.components.texts.Title
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController
import mx.edu.utez.examenuii.ui.components.PassportList
import mx.edu.utez.examenuii.ui.components.texts.Label
import mx.edu.utez.examenuii.viewmodel.PassportViewModel

@Composable
fun PassportScreen(viewModel: PassportViewModel, navController: NavController){
    Column () {
        Title("Pasaportes registrados")
        val pasaportes by viewModel.pasaportes.collectAsStateWithLifecycle()
        PassportList(pasaportes) { viewModel::clickPasaporte }
        Label("No hay más pasaportes")
    }
}