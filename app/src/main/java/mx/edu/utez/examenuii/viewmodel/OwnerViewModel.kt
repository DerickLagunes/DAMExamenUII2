package mx.edu.utez.examenuii.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import mx.edu.utez.examenuii.data.model.Owner

class OwnerViewModel: ViewModel() {

    val _owners = MutableStateFlow<List<Owner>>(emptyList())
    val owners: StateFlow<List<Owner>> = _owners
    private val _selectedOwner = MutableStateFlow<Owner?>(null)
    val selectedOwner: StateFlow<Owner?> = _selectedOwner

    init {
        _owners.value = listOf(
            //Dueños
        )
    }
    fun clickPassport(owner: Owner){
        println("Has hecho click en: ${owner.nombres}")
        _selectedOwner.value = owner
    }

}