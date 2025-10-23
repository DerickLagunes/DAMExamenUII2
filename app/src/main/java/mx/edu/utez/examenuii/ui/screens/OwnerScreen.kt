package mx.edu.utez.examenuii.ui.screens

import androidx.compose.foundation.layout.Arrangement
import mx.edu.utez.examenuii.ui.components.texts.Title
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController
import mx.edu.utez.examenuii.ui.components.OwnerList
import mx.edu.utez.examenuii.ui.components.texts.Label
import mx.edu.utez.examenuii.viewmodel.OwnerViewModel

@Composable
fun OwnerScreen(viewModel: OwnerViewModel, navController: NavController){
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(999.dp)
    ) {
        Title("Pasaportes registrados")
        val duenos by viewModel.owners.collectAsStateWithLifecycle()
        OwnerList(duenos) { dueno ->
            viewModel.clickPassport(dueno)
            navController.navigate("mascotas")
        }
        Label("No hay más dueños")
    }
}