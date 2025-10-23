package mx.edu.utez.examenuii.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import mx.edu.utez.examenuii.data.model.Owner

@Composable
fun OwnerList(lista: List<Owner>, x: (Owner) -> Unit) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(999.dp)
    ) {
        items(items = lista, key = {it.id} ) {owner ->
            OwnerCard(owner,x)
        }
    }
}