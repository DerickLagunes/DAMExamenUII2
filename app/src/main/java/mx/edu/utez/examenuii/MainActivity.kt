package mx.edu.utez.examenuii

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import mx.edu.utez.examenuii.ui.theme.ExamenUIITheme
import mx.edu.utez.examenuii.ui.Navigation


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExamenUIITheme {
                Navigation()
                //Punto: Separa los componentes individuales de OwnerCard y PetScreen en diferentes archivos dentro de UI
                //Punto: Genera 4 dueños con distintos datos entre ellos (observa la estructura de Owner.kt)
                //Punto: Al dar click en un dueño se presentan las mascotas que tienen,
                //       cambia la estructura de datos de Pet para incluir:
                //       edad de la mascota
                //       raza de la mascota
                //       fecha de nacimiento de la mascota
                //       Configura la vista para incluir esa nueva información
            }
        }
    }
}