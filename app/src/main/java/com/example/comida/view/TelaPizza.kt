package com.example.comida.view

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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposableOpenTarget
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
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
fun TelaPizza(navController: NavController){
    val modifier: Modifier = Modifier

    Column(
        Modifier
            .verticalScroll(ScrollState(0))
            .background(color = Color(0xFF926741))
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Spacer(Modifier.padding(30.dp))

    Text(
        text = "COMIDA ESCOLHIDA É:",
        fontSize = 28.sp,
        color = Color(0xFFFFFFFF),
    )
    Text(
        text = "PIZZA",
        fontSize = 48.sp,
        color = Color(0xFF59BFC6)
    )
    Image(
        painter = painterResource(id = R.drawable.pizzaarrumada),
        contentDescription = ""
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
        text = "Ingredientes(10 porções):\n",
        color = Color(0xFFFCAB52),
        fontSize = 30.sp
        )
        Text(
            text = "Massa",
            color = Color(0xFFFCAB52),
            fontSize = 28.sp
        )
    Surface(
        Modifier
            .width(282.dp)
            .padding(8.dp),
        color = Color.Transparent,
        ) {
            Text(
                text = "1 xícara (chá) de leite;\n" +
                        "\n" +
                        "1 colher (chá) de sal;\n" +
                        "\n" +
                        "1 colher (sopa) de margarina;\n" +
                        "\n" +
                        "1 colher (sobremesa) de fermento em pó;\n" +
                        "\n" +
                        "1 ovo;\n" +
                        "\n" +
                        "1 colher (chá) de açúcar;\n" +
                        "\n" +
                        "1 e 1/2 xícara (chá) de farinha de trigo;\n" +
                        "\n" +
                        "1/2 lata de molho de tomate.\n" +
                        "\n",
                color = Color(0xFFFFFFFF),
                fontSize = 25.sp
            )
        }
        Text(
            text = "Sugestão de Recheio:",
            color = Color(0xFFFCAB52),
            fontSize = 28.sp
        )
        Surface(
            Modifier
                .width(282.dp)
                .padding(8.dp),
            color = Color.Transparent,
        ) {
            Text(
                text = "250g de mussarela ralada grossa;\n" +
                        "\n" +
                        "Azeitona picada;\n" +
                        "\n" +
                        "2 tomates fatiados;\n" +
                        "\n" +
                        "Orégano a gosto.\n",
                color = Color(0xFFFFFFFF),
                fontSize = 25.sp
            )
        }
        Text(
            text = "Modo de Preparo:",
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
                text = "1° No liquidificador bata o leite, o ovo, o sal, o açúcar, a margarina, a farinha de trigo e o fermento em pó até que tudo esteja encorporado.\n" +
                        "\n" +
                        "2° Despeje a massa em uma assadeira para pizza untada com margarina e leve ao forno preaquecido por 20 minutos.\n" +
                        "\n" +
                        "3° Retire do forno e despeje o molho de tomate.\n" +
                        "\n" +
                        "4° Cubra a massa com mussarela ralada, tomate e orégano a gosto.\n" +
                        "\n" +
                        "5° Leve novamente ao forno até derreter a mussarela.",
                color = Color(0xFFFFFFFF),
                fontSize = 25.sp
            )
        }
        Spacer(Modifier.padding(20.dp))

        Row(){
            Button(onClick = { navController.navigate("telaHamburguer") },
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

            Button(onClick = { navController.navigate("telaLasanha") },
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

@Preview(heightDp = 5000)
@Composable
fun TelaPizzaPreview(){
    ComidaTheme {
        TelaPizza(navController = rememberNavController())
    }
}