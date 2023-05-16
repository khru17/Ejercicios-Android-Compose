package com.example.greetingcardcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingcardcompose.ui.theme.GreetingCardComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingCardComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

/*
Esto es una de componibilidad que toma alguna entrada y genera lo que se muestra en la pantalla:
    - Los nombres de las funciones @Composable llevan mayúscula
    - Antes de la función, se agrega la anotación @Composable
    - Las funciones @Composable no pueden mostrar nada
 */

@Composable
fun Greeting(name: String) {
    /*
    Surface es un contenedor que representa una sección de la IU en la que se puede
    modificar el aspecto, como el borde o el color de fondo.
     */
    Surface(color = Color.Magenta) {
        /*
        Se usa un Modifier para aumentar o decorar un elemento que admite composición.
        Un modificador que se puede usar el modificador padding, que se logra con la función
        Modifier.padding()
         */
        Text(text = "Hi, my name is $name!", modifier = Modifier.padding(24.dp))
    }
}

/*
La función DefaultPreview() permite ver cómo se ve la app sin tener que compilarla por completo
Para que pueda ser una fucnión de vista previa, debe de tener la anotación @Preview
 */
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GreetingCardComposeTheme {
        Greeting("Juan")
    }
}