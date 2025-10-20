package mx.edu.utez.examenuii.data.model

import androidx.annotation.DrawableRes

data class Sello (
    val id: Int,
    val pais: String,
    @DrawableRes val sello: Int
)