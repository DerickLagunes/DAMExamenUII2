package mx.edu.utez.examenuii.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import mx.edu.utez.examenuii.data.model.Passport

@Composable
fun PassportList(lista: List<Passport>, x: (Passport) -> Unit) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        items(items = lista, key = {it.id} ) {passport ->
            PassportCard(passport,x)
        }
    }
}