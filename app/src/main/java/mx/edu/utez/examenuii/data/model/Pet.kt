package mx.edu.utez.examenuii.data.model

import androidx.annotation.DrawableRes

data class Pet (
    val id: Int,
    val nombre: String,
    @DrawableRes val foto: Int
)