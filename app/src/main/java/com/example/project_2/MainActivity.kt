package com.example.project_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project2.R
import com.example.project_2.ui.theme.Project_2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Project_2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   BasicCompose(
                        modifier = Modifier.padding(innerPadding)
                   )

                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun BasicCompose(
    modifier: Modifier = Modifier)
{ Column (
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center,
    modifier = Modifier.fillMaxSize() )
{
    Text(text = "Login", style = TextStyle(fontSize = 50.sp,
        fontWeight = FontWeight.Bold ))
    Text(text = "Ini  halaman Login ")
    Image(painter = painterResource(id = R.drawable.logo),
        contentDescription = null,
        modifier = modifier.padding(top = 18.dp).size(200.dp)
    )
    Text(text="Nama",
        modifier = modifier.padding(top = 10.dp))
    Text(text = "Dzaky Hanif Annafi",
        color = Color.Red,
        style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold))
    Text(text = "20220140077",
        style = TextStyle(fontSize = 50.sp, fontWeight = FontWeight.Bold),
    )
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Project_2Theme {
        Greeting("Android")
    }
}