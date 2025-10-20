package mx.edu.utez.examenuii.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import mx.edu.utez.examenuii.data.model.Passport

class PassportViewModel: ViewModel() {

    //Vamos a usar algo conocido como mutableStateFLOW
    val _passports = MutableStateFlow<List<Passport>>(emptyList())
    val passports: StateFlow<List<Passport>> = _passports

    init {
        _passports.value = listOf(
            Passport(
                1,
                "Marlen",
                "marlen@gmail.com",
                "7771836233",
                R.drawable.femaleprofile,
                lugarNacimiento = TODO(),
                sexo = TODO(),
                firma = TODO(),
                codigo = TODO(),
                sellos = TODO()
            )
        )
    }

    fun clickPassport(Passport: Passport){
        println("Has hecho click en: ${Passport.nombre}")
    }

}