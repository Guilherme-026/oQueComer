package com.example.comida.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.comida.R
import com.example.comida.ui.theme.ComidaTheme

@Composable
fun TelaLasanha(navController: NavController){
    val modifier: Modifier
    Column(
        Modifier
            .verticalScroll(ScrollState(0))
            .background(color = Color(0xFF926741))
            .fillMaxSize(),
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
        text = "LASANHA",
        fontSize = 48.sp,
        color = Color(0xFF59BFC6)
    )
    Image(
        painter = painterResource(id = R.drawable.lasanhaarrumada),
        contentDescription = "",
        Modifier
            .size(300.dp)
    )
        Spacer(modifier = Modifier.padding(16.dp))

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
        text = "Ingredientes(15 porções):\n",
        color = Color(0xFFFCAB52),
        fontSize = 30.sp
    )
    Surface(
        Modifier
            .width(282.dp)
            .padding(8.dp),
        color = Color.Transparent,
    ){
        Text(
            text = "500g de massa de lasanha;\n" +
                    "\n" +
                    "2 caixas de creme de leite;\n" +
                    "\n" +
                    "3 colheres de farinha de trigo;\n" +
                    "\n" +
                    "500g de mussarela;\n" +
                    "\n" +
                    "2 copos de leite;\n" +
                    "\n" +
                    "3 colheres de óleo;\n" +
                    "\n" +
                    "3 dentes de alho amassados;\n" +
                    "\n" +
                    "500g de carne moída;\n" +
                    "\n" +
                    "3 colheres de manteiga;\n" +
                    "\n" +
                    "500g de presunto;\n" +
                    "\n" +
                    "Sal a gosto;\n" +
                    "\n" +
                    "1 cebola ralada;\n" +
                    "\n" +
                    "1 caixa de molho de tomate;\n" +
                    "\n" +
                    "1 pacote de queijo ralado.\n",
            color = Color(0xFFFFFFFF),
            fontSize = 25.sp
        )
    }
    Text(
        text = "Modo de Preparo(50min):",
        color = Color(0xFFFCAB52),
        fontSize = 28.sp
    )
    Surface(
        Modifier
            .width(282.dp)
            .padding(8.dp),
        color = Color.Transparent,
    ){
        Text(
            text = "1° Lasanha: Cozinhe a massa segundo as orientações do fabricante, despeje em um refratório com água gelada para não grudar e reserve.\n" +
                    "\n" +
                    "2° Molho à bolonhesa: Refogue o alho, a cebola, a carne moída, o molho de tomate, deixe cozinhar por 3 minutos e reserve.\n" +
                    "\n" +
                    "3° Molho branco: Derreta a margarina, coloque as 3 colheres de farinha de trigo e mexa.\n" +
                    "\n" +
                    "4° Despeje o leite aos poucos e continue mexendo.\n" +
                    "\n" +
                    "5° Por último, coloque o creme de leite, mexa por 1 minuto e desligue o fogo.\n" +
                    "\n" +
                    "6° Montagem: Despeje uma parte do molho à bolonhesa em um refratário, a metade da massa, a metade do presunto, a metade da mussarela, todo o molho branco e o restante da massa.\n" +
                    "\n" +
                    "7° Repita as camadas até a borda do recipiente.\n" +
                    "\n" +
                    "8° Finalize com queijo ralado e leve ao forno alto (220°C), preaquecido, por cerca de 20 minutos.",
            color = Color(0xFFFFFFFF),
            fontSize = 25.sp
        )
    }
        Spacer(Modifier.padding(20.dp))

        Row(){
            Button(onClick = { navController.navigate("telaPizza") },
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

            Button(onClick = { navController.navigate("telaInicial") },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF59BFC6)
                )
            ){
                Text(
                    text = "INÍCIO",
                    fontSize = 18.sp,
                    color = Color(0xFFFEF0D6)
                )
            }
        }
    }
}

@Preview(heightDp = 5000)
@Composable
fun TelaLasanhaPreview(){
    ComidaTheme {
        TelaLasanha(navController = rememberNavController())
    }
}