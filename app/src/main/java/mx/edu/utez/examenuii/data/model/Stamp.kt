package mx.edu.utez.examenuii.data.model

import androidx.annotation.DrawableRes

data class Stamp (
    val id: Int,
    val pais: String,
    @DrawableRes val sello: Int
)