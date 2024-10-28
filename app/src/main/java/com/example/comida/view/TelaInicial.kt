package com.example.comida.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.comida.R
import com.example.comida.ui.theme.ComidaTheme

@Composable
fun TelaInicial(navController: NavController) {

val modifier: Modifier = Modifier
.fillMaxSize()

    Column(modifier = modifier
        .background(color = Color(0xFF926741)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){

        Spacer(Modifier.padding(30.dp))

        Text(
            text = "O QUE VAMOS PREPARAR?",
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFffffff),
        )

        Spacer(
            modifier = Modifier.padding(30.dp)
        )

        Image(painter = painterResource(id = R.drawable.telaprincipal),
            contentDescription = "",
            Modifier
                .width(388.dp)
                .height(377.dp)
        )

        Spacer(
            modifier = Modifier.padding(30.dp)
        )

        Button(onClick = {
            navController.navigate("telaHamburguer")
        },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF59BFC6)
            ),
            modifier = Modifier
                .height(99.dp)
                .width(283.dp)
        )
        {
            Text(text = "ESCOLHER",
                fontSize = 30.sp,
                color = Color(0xFFFEF0D6)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TelaInicialPreview() {
    ComidaTheme {
        TelaInicial(navController = rememberNavController())
    }
}