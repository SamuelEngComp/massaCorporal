package br.com.massacorporal.telas

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import br.com.massacorporal.ui.theme.MassaCorporalTheme


@Composable
fun TelaInicial(){

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        
        Row() {
            Text(text = "Massa Corporal", style = MaterialTheme.typography.displayMedium)
        }

        Surface(modifier = Modifier.fillMaxWidth(0.8f)) {
            Text(text = "Teste aqui Teste aqui Teste aqui Teste aqui Teste aqui Teste aqui Teste " +
                    "aqui Teste aqui Teste aqui Teste aqui Teste aqui Teste aqui Teste aqui Teste " +
                    "aqui Teste aqui Teste aqui Teste aqui Teste aqui Teste aqui Teste aqui Teste " +
                    "aqui Teste aqui")
        }
        
        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier.fillMaxWidth(0.8f),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Cálculo IMC")
            }

            Button(onClick = { /*TODO*/ }) {
                Text(text = "Cálculo IAC")
            }
        }
    }
}
