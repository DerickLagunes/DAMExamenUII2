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
                //Punto: Separa los componentes individuales de PassportCard y StampScreen en diferentes archivos dentro de UI
                //Punto: Genera 4 pasaportes con distintos datos entre ellos (observa la estructura de Passport.kt)
                //Punto: Al dar click en un pasaporte se presentan las estampas de los lugares que ha visitado las personas,
                //       cambia la estructura de datos de Stamp para incluir: fecha de ingreso al país y fecha de salida
                //       Configura la vista para incluir esa nueva información
            }
        }
    }
}