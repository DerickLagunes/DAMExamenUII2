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
    private val _selectedPassport = MutableStateFlow<Passport?>(null)
    val selectedPassport: StateFlow<Passport?> = _selectedPassport

    init {
        _passports.value = listOf(
            //Pasaportes
        )
    }
    fun clickPassport(passport: Passport){
        println("Has hecho click en: ${passport.nombres}")
        _selectedPassport.value = passport
    }

}