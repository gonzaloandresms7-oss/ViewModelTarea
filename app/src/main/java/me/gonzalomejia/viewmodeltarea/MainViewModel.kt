package me.gonzalomejia.viewmodeltarea

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var contador by mutableStateOf(0)

    val explicacion: String = """
        ¿Qué es un ViewModel?
        
        Es una clase que se encarga de guardar y controlar los datos de una pantalla. Además,
        mantiene esos datos cuando ocurren cambios de configuración o al cambiar de vista y volver
        sin perder sus valores.
    """.trimIndent()

    fun incrementar() {
        contador++
    }
}