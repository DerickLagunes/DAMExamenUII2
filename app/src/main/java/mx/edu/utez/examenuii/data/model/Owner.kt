package mx.edu.utez.examenuii.data.model

import androidx.annotation.DrawableRes
import mx.edu.utez.examenuii.R

data class Owner(
    val id:Int,
    @DrawableRes val foto: Int,
    val nombres: String,
    val apellidos: String,
    val fechaNacimiento: String,
    val lugarNacimiento: String,
    val sexo: Int, //<-- 0 = Mujer, 1 = Hombre
    val pets: List<Pet>, //recuerda: una lista se crea con listOf()
     )