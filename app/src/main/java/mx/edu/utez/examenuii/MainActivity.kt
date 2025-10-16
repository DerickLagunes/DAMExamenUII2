package mx.edu.utez.examenuii

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import mx.edu.utez.calculadoramvvm.ui.theme.ExamenUIITheme
import mx.edu.utez.examenuii.ui.Navigation


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExamenUIITheme {
                Navigation()
            }
        }
    }
}