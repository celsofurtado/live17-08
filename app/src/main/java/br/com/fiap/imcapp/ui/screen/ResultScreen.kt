package br.com.fiap.imcapp.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun ResultScreen(navController: NavHostController) {
  Column {
    Text(text = "TELA RESULT")
    Spacer(modifier = Modifier.height(64.dp))
    IconButton(onClick = {}) {
      Icon(
        imageVector = Icons.Default.ArrowBack,
        contentDescription = "Botão voltar"
      )
    }
  }
}