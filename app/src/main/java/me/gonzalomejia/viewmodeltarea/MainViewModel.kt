package me.gonzalomejia.viewmodeltarea

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var contador by mutableStateOf(0)
        private set

    val explicacion: String = """
        ¿Qué es un ViewModel en Jetpack Compose?
        
        Es un componente que conserva y gestiona el estado de la UI. 
        Sobrevive a los cambios de configuración (como rotar la pantalla) 
        sin perder el valor de sus variables.
    """.trimIndent()

    fun incrementar() {
        contador++
    }
}