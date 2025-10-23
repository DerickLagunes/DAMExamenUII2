package mx.edu.utez.examenuii.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mx.edu.utez.examenuii.R
import mx.edu.utez.examenuii.data.model.Owner
import mx.edu.utez.examenuii.data.model.Pet

//Punto: Separa los componentes individuales a archivos dentro de UI
@Composable
fun OwnerCard(owner: Owner, x: (Owner) -> Unit, modifier: Modifier = Modifier) {
    val cardBgColor = Color(0xFFD8EFF5)

    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clickable { x(owner) },
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        colors = CardDefaults.cardColors(containerColor = cardBgColor),
        shape = RoundedCornerShape(12.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            AppHeader()
            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.Top
            ) {
                Column(
                    modifier = Modifier.weight(0.4f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = owner.foto),
                        contentDescription = "Foto de ${owner.nombres}",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                            .aspectRatio(3f / 4f)
                            .clip(RoundedCornerShape(8.dp))
                            .border(1.dp, Color.Gray, RoundedCornerShape(8.dp))
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    DataField("Mascotas", owner.pets.size.toString())
                }

                Spacer(modifier = Modifier.width(16.dp))

                Column(
                    modifier = Modifier.weight(0.6f)
                ) {
                    DataField("ID Dueño", owner.id.toString())
                    DataField("Apellidos", owner.apellidos.uppercase())
                    DataField("Nombres", owner.nombres.uppercase())
                    DataField("Fecha de Nacimiento", owner.fechaNacimiento)
                    DataField("Sexo", if (owner.sexo == 0) "Mujer" else "Hombre")
                    DataField("Lugar de Nacimiento", owner.lugarNacimiento.uppercase())
                }
            }
        }
    }
}

/**
 * NUEVO Header: Reemplaza a PassportHeader
 */
@Composable
private fun AppHeader() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        Icon(
            imageVector = Icons.Filled.Favorite,
            contentDescription = "Logo Sistema Mascotas",
            modifier = Modifier.size(40.dp),
            tint = MaterialTheme.colorScheme.primary
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = "Sistema Mascotas Utez",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.titleLarge
        )
    }
}

@Composable
private fun DataField(
    label: String,
    value: String = "",
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.padding(bottom = 6.dp)) {
        Text(
            text = label.uppercase(),
            fontSize = 9.sp,
            color = Color.Gray,
            letterSpacing = 0.5.sp
        )
        if (value.isNotEmpty()) {
            Text(
                text = value,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black
            )
        }
    }
}