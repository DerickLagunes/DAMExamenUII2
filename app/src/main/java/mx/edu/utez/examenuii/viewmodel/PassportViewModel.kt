package mx.edu.utez.examenuii.viewmodel

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import mx.edu.utez.examenuii.R
import mx.edu.utez.examenuii.data.model.Passport
import mx.edu.utez.examenuii.data.model.Stamp

class PassportViewModel: ViewModel() {

    val _passports = MutableStateFlow<List<Passport>>(emptyList())
    val passports: StateFlow<List<Passport>> = _passports

    // Un StateFlow para guardar el pasaporte en el que se hizo click
    private val _selectedPassport = MutableStateFlow<Passport?>(null)
    val selectedPassport: StateFlow<Passport?> = _selectedPassport

    init {
        _passports.value = listOf(
            Passport(
                1,
                R.drawable.utezlogo,
                "Marlen",
                "Gomez",
                "marlen@gmail.com",
                "7771836233",
                0,
                firma = R.drawable.firma_generica,
                stamps = listOf(
                    Stamp(1, "Mexico", R.drawable.mexico),
                    Stamp(2, "Canadá", R.drawable.canada)
                )
            )
        )
    }
    fun clickPassport(passport: Passport){
        println("Has hecho click en: ${passport.nombres}")
        _selectedPassport.value = passport
    }

}