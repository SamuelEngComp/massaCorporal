package br.com.massacorporal.telas

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Clear

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import br.com.massacorporal.R


@Composable
fun TelaCalculoIMC(){


    var altura by remember { mutableStateOf(0.00f) }
    var peso by remember { mutableStateOf(0.00f) }

    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()

    Column(modifier = Modifier.fillMaxSize()) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Column(modifier = Modifier.padding(10.dp)) {
                IconButton(
                    onClick = {
                        //altura -= 0.01f
                    },
                    interactionSource = interactionSource
                ) {
                    Icon(painter = painterResource(id = R.drawable.ic_remove_24), contentDescription = "Botão remover")
                }
            }

            Column(modifier = Modifier.padding(10.dp)) {
                if (altura == 0.00f){
                    Text(text = "Altura (m)", modifier = Modifier.padding(20.dp))
                }else{
                    Text(text = "$altura".format("%.2f"), modifier = Modifier.padding(20.dp))
                }
            }

            Column(modifier = Modifier.padding(10.dp)) {
                IconButton(onClick = {
                    altura += 0.01f
                }) {
                    Icon(imageVector = Icons.Default.Add, contentDescription = "Botão add")
                }
            }

        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {

            IconButton(onClick = {
                peso -= 0
            }) {
                Icon(painter = painterResource(id = R.drawable.ic_remove_24), contentDescription = "Botão remover")
            }

            if(peso == 0.00f){
                Text(text = "Peso (kg)", modifier = Modifier.padding(20.dp))
            }else{
                Text(text = "%.2f".format(peso), modifier = Modifier.padding(20.dp))
            }

            IconButton(
                onClick = {
                    //peso += 0.01f
                },
                interactionSource = interactionSource) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Botão add")
            }

        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {

            if (altura == 0.00f || peso == 0.00f){
                Text(text = "Resultado: ", modifier = Modifier.padding(20.dp))
            }else{
                Text(text = "Resultado: ${(peso/(altura*altura))}", modifier = Modifier.padding(20.dp))
            }
        }

        Row() {
            Text(
                if (isPressed){
                    peso += 0.01f
                    "Pressed! $peso"

                }  else{
                    "Not pressed"
                }
            )

        }
    }
}