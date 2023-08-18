package br.com.fiap.imcapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.imcapp.ui.screen.ImcScreen
import br.com.fiap.imcapp.ui.screen.LoginScreen
import br.com.fiap.imcapp.ui.screen.ResultScreen
import br.com.fiap.imcapp.ui.theme.ImcAppTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      ImcAppTheme {
        Surface(
          modifier = Modifier.fillMaxSize(),
          color = MaterialTheme.colorScheme.background
        ) {
          val navController = rememberNavController()
          NavHost(
            navController = navController,
            startDestination = "login"
          ){
            composable(route = "login"){ LoginScreen(navController) }
            composable(route = "imc"){ ImcScreen(navController) }
            composable(route = "resultado"){ ResultScreen(navController) }
          }
        }
      }
    }
  }
}

