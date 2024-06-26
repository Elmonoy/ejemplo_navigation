package com.example.clase2_jetpack_compose.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.clase2_jetpack_compose.R


@Composable
fun Main1() {
    Box(
        modifier = Modifier
            .fillMaxSize()

    ) {
        Content1()
    }
}


@Composable
fun Content1(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {


        Text(text = "HISTORIA DE LA BARBERIA",
        modifier = Modifier
            .fillMaxWidth()
            .padding(2.dp),
            color = Color.Black,
            textAlign = TextAlign.Center,
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            textDecoration = TextDecoration.Underline
        )
        Box {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "El origen de la barbería se remonta a los antiguos egipcios. El oficio" +
                            " de barbero se presenta como uno de los primeros en la historia. Tanto en " +
                            "la cultura egipcia como en la romana y en la antigua Grecia, el barbero era un" +
                            " hombre de una gran importancia en la sociedad, distinguido y respetado.",
                    modifier = Modifier.padding(20.dp),
                    textAlign = TextAlign.Justify,
                    fontSize = 18.sp
                )
            }
        }
    }
}



@Composable
fun Fila1(
    img : Int,
    descript: String,
    modifier: Modifier = Modifier.fillMaxWidth(),
    imgmodifier: Modifier = Modifier
){
    Row (modifier = modifier,
        horizontalArrangement = Arrangement.Center){
        Image(painter = painterResource(id = img),
            contentDescription = descript,
            modifier = Modifier
                .width(350.dp)
                .height(350.dp))
    }
}

@Preview(showSystemUi = true, device = Devices.DEFAULT)
@Composable
fun PreviewMain() {
    Main1()
}
