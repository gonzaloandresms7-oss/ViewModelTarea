    package me.gonzalomejia.viewmodeltarea

    import android.os.Bundle
    import androidx.activity.ComponentActivity
    import androidx.activity.compose.setContent
    import androidx.activity.enableEdgeToEdge
    import androidx.compose.foundation.layout.fillMaxSize
    import androidx.compose.foundation.layout.padding
    import androidx.compose.material3.Scaffold
    import androidx.compose.material3.Text
    import androidx.compose.runtime.Composable
    import androidx.compose.ui.Modifier
    import androidx.compose.ui.tooling.preview.Preview
    import me.gonzalomejia.viewmodeltarea.ui.theme.ViewModelTareaTheme
    import androidx.compose.foundation.layout.*
    import androidx.compose.material3.*
    import androidx.compose.runtime.*
    import androidx.compose.ui.Alignment
    import androidx.compose.ui.unit.dp
    import androidx.compose.ui.unit.sp
    import androidx.lifecycle.viewmodel.compose.viewModel


    class MainActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContent {
                    val viewModel: MainViewModel = viewModel()

                    var verSegundaVista by remember { mutableStateOf(false) }

                        if (!verSegundaVista) {
                            Column(
                                modifier = Modifier.fillMaxSize().padding(24.dp),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(text = "Vista 1", fontSize = 24.sp)
                                Text(text = "Contador: ${viewModel.contador}", fontSize = 20.sp)

                                Button(onClick = { viewModel.incrementar() }) {
                                    Text("Sumar")
                                }
                                Button(onClick = { verSegundaVista = true }) {
                                    Text("Ir a Vista 2")
                                }
                            }
                        } else {
                            Column(
                                modifier = Modifier.fillMaxSize().padding(24.dp),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(text = "Vista 2", fontSize = 20.sp)
                                Text(text = "Contador actual: ${viewModel.contador}", fontSize = 20.sp)
                                Text(
                                    text = viewModel.explicacion,
                                    fontSize = 14.sp,
                                    modifier = Modifier.padding(horizontal = 8.dp)
                                )
                                Button(onClick = { verSegundaVista = false }) {
                                    Text("Volver a Vista 1")
                                }
                            }
                        }
                    }
                 }
            }