package br.com.massacorporal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContextCompat
import br.com.massacorporal.telas.TelaCalculoIMC
import br.com.massacorporal.telas.TelaInicial
import br.com.massacorporal.ui.theme.MassaCorporalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this.window.statusBarColor = ContextCompat.getColor(this, R.color.black)

        setContent {
            MassaCorporalTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //TelaInicial()
                    TelaCalculoIMC()
                }
            }
        }
    }
}