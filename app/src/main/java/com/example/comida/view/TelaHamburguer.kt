package com.example.comida.view

import androidx.compose.animation.slideInHorizontally
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeNodeLifecycleCallback
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.comida.R
import com.example.comida.ui.theme.ComidaTheme


@Composable
fun TelaHambuerguer(navController: NavController){
val modifier: Modifier = Modifier
    .fillMaxSize()

    Column(modifier = modifier
        .verticalScroll(ScrollState(0))
        .background(color = Color(0xFF926741)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(Modifier.padding(30.dp))

        Text(
            text = "COMIDA ESCOLHIDA É:",
            fontSize = 28.sp,
            color = Color(0xFFFFFFFF),
        )
        Text(
            text = "HAMBÚRGUER",
            fontSize = 48.sp,
            color = Color(0xFF59BFC6)
        )
        Image(
            painter = painterResource(id = R.drawable.hamburguer),
            contentDescription = "",
            Modifier
                .width(266.dp)
                .height(252.dp)
        )
        Text(
            text = "RECEITA",
            fontSize = 28.sp,
            color = Color(0xFFFFFFFF)
        )
        Image(
            imageVector = ImageVector.vectorResource(id = R.drawable.baseline_arrow_forward_24),
            contentDescription = "",
            Modifier
                .graphicsLayer { rotationZ = 90f }
                .size(60.dp)
        )
        Text(
            text = "Ingredientes:",
            color = Color(0xFFFCAB52),
            fontSize = 32.sp
        )
        Surface(
            Modifier
                .width(282.dp)
                .padding(8.dp),
            color=Color.Transparent
        ){
            Text(
                text = "1Kg Carne moída (de preferência patinho);\n" +
                        "\n" +
                        "1 Cebola média picada;\n" +
                        "\n" +
                        "Cebolinha a gosto;\n" +
                        "\n" +
                        "Orégano a gosto;\n" +
                        "\n" +
                        "1 Sachê de creme de alho picado;\n" +
                        "\n" +
                        "Sal a gosto;\n" +
                        "\n" +
                        "Pimenta a gosto.\n",
                color = Color(0xFFFFFFFF),
                fontSize = 25.sp
            )
        }
        Text(
            text = "Modo de Preparo: 30min",
            color = Color(0xFFFCAB52),
            fontSize = 32.sp
        )
        Surface(
            Modifier
                .width(282.dp)
                .padding(8.dp),
            color=Color.Transparent

        ) {
            Text(
                text = ("1° Misture todos os ingredientes, amasse bem e" +
                    "forme bolinhas, depois achate para ter a forma de hambúrguer.\n" +
                    "\n" +
                    "2° Frite numa frigideira antiaderente, coloque uma " +
                    "colher de óleo pois a carne não tem gordura."),
                color = Color(0xFFFFFFFF),
                fontSize = 25.sp
            )
        }

        Spacer(Modifier.padding(20.dp))

        Row(){
            Button(onClick = { navController.navigate("telaInicial") },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF59BFC6)
                )
        ){
            Text(
                text = "VOLTAR",
                fontSize = 18.sp,
                color = Color(0xFFFEF0D6)
            )
        }
            Spacer(Modifier.padding(40.dp))

        Button(onClick = { navController.navigate("telaPizza") },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF59BFC6)
            )
        ){
                Text(
                    text = "PRÓXIMO",
                    fontSize = 18.sp,
                    color = Color(0xFFFEF0D6)
                )
            }
        }
    }
}



@Preview(heightDp = 1500)
@Composable
fun TelaHambuerguerPreview(){
    ComidaTheme {
        TelaHambuerguer(navController = rememberNavController())
    }
}