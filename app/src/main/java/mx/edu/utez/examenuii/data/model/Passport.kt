package mx.edu.utez.examenuii.data.model

import androidx.annotation.DrawableRes
import mx.edu.utez.examenuii.R

//Simplificación del pasaporte (en la vida real hay más datos)
data class Passport(
    val id:Int,
    @DrawableRes val foto: Int,
    val nombres: String,
    val apellidos: String,
    val fechaNacimiento: String,
    val lugarNacimiento: String,
    val sexo: Int, //<-- 0 = hombre, 1 = mujer, 2 = otro
    @DrawableRes val firma: Int = R.drawable.firma_generica,
    val codigo: String = "P<MEXUTEZ<<LUIS<<<<<<<A123456789MEX9506227M75001012<<<<<<<<<<<<<<<<<<", //El código en teoria se genera a traves de los datos del pasaporte pero puedes dejarlo asi
    val sellos: List<Sello>,
    )