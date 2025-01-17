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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.clase2_jetpack_compose.R



@Composable
fun Main3(navigation:NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()

    ) {
        Content3(navigation)
    }
}


@Composable
fun Content3(navegation:NavHostController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {


        Text(text = "QUE ES LA BARBERIA",
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
                    text = "Barbero es la persona cuya ocupación"+
                    "es afeitar o arreglar la barba y cortar y acondicionar "+
                            "el cabello masculino. Su lugar de trabajo se conoce como"+
                            "«barbería» o «casa del barbero». Las barberías eran también+" +
                            " lugares de interacción social y discurso público.Barbero es la+" +
                            " persona cuya ocupación es afeitar o arreglar la barba y cortar y +" +
                            "acondicionar el cabello masculino. Su lugar de trabajo se conoce como +" +
                            "«barbería» o «casa del barbero». Las barberías eran también lugares de " +
                            "interacción social y discurso público. " ,

                    modifier = Modifier.padding(20.dp),
                    textAlign = TextAlign.Justify,
                    fontSize = 18.sp
                )
                Button(
                    onClick = { navegation.navigate("view_2")}, colors = ButtonDefaults.buttonColors(
                    )
                ) {
                    Text(text = "Mas Info", color = Color.Black, fontWeight = FontWeight.Bold)
                }

            }
        }
    }
}
@Composable
fun Fila3(
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



