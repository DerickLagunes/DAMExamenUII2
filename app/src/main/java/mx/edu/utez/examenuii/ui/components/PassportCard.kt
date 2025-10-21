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
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mx.edu.utez.examenuii.R
import mx.edu.utez.examenuii.data.model.Passport

//Punto: Separa los componentes individuales a archivos dentro de UI
@Composable
fun PassportCard(passport: Passport, x: (Passport) -> Unit, modifier: Modifier = Modifier) {

    // El color de fondo de la página del pasaporte
    val passportBgColor = Color(0xFFF5F8F0)

    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clickable{x(passport)},
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        colors = CardDefaults.cardColors(containerColor = passportBgColor),
        shape = RoundedCornerShape(12.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            PassportHeader()
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
                        painter = painterResource(id = passport.foto),
                        contentDescription = "Foto de perfil",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                            .aspectRatio(3f / 4f)
                            .clip(RoundedCornerShape(8.dp))
                            .border(1.dp, Color.Gray, RoundedCornerShape(8.dp))
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    DataField(label = "Firma del Titular")
                    Image(
                        painter = painterResource(id = passport.firma),
                        contentDescription = "Firma",
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .height(40.dp)
                            .fillMaxWidth()
                            .padding(horizontal = 8.dp)
                    )
                }
                Spacer(modifier = Modifier.width(16.dp))
                Column(
                    modifier = Modifier.weight(0.6f)
                ) {
                    Row {
                        DataField("Tipo", "P", Modifier.weight(1f))
                        DataField("Cve. País", "MEX", Modifier.weight(1f))
                    }
                    DataField("Pasaporte No.", passport.id.toString())
                    DataField("Apellidos", passport.apellidos.uppercase())
                    DataField("Nombres", passport.nombres.uppercase())
                    DataField("Fecha de Nacimiento", passport.fechaNacimiento)
                    DataField("Sexo", if (passport.sexo == 0) "Mujer" else "Hombre")
                    DataField("Lugar de Nacimiento", passport.lugarNacimiento.uppercase())
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Divider(color = Color.Gray.copy(alpha = 0.5f))
            Spacer(modifier = Modifier.height(8.dp))
            MRZText(text = passport.codigo)
        }
    }
}

@Composable
private fun PassportHeader() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            painter = painterResource(id = R.drawable.escudo),
            contentDescription = "Escudo de México",
            modifier = Modifier.size(50.dp)
        )

        Column(horizontalAlignment = Alignment.End) {
            Text(
                text = "PASAPORTE",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                letterSpacing = 2.sp
            )
            Text(
                text = "ESTADOS UNIDOS MEXICANOS",
                fontSize = 12.sp,
                color = Color.DarkGray
            )
            Text(
                text = "PASSPORT",
                fontSize = 14.sp,
                color = Color.DarkGray
            )
        }
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


@Composable
private fun MRZText(text: String) {
    Text(
        text = text,
        fontFamily = FontFamily.Monospace,
        fontSize = 13.sp,
        color = Color.Black,
        letterSpacing = 2.sp,
        lineHeight = 16.sp,
        modifier = Modifier.fillMaxWidth()
    )
}
