package com.example.comida

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.comida.ui.theme.ComidaTheme
import com.example.comida.view.TelaHambuerguer
import com.example.comida.view.TelaInicial
import com.example.comida.view.TelaLasanha
import com.example.comida.view.TelaPizza

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComidaTheme {

                   val navController = rememberNavController()
                   NavHost(navController = navController, startDestination = "telaInicial"){
                       composable(
                           "telaInicial"
                       ){
                            TelaInicial(navController)
                       }

                       composable(
                           route = "telaHamburguer"
                       ){
                           TelaHambuerguer(navController)
                       }

                       composable(
                           "telaPizza"
                       ){
                           TelaPizza(navController)
                       }

                       composable(
                           "telalasanha"
                       ){
                           TelaLasanha(navController)
                       }
                    }
                }
            }
        }
    }

