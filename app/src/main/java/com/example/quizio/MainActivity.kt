package com.example.quizio

import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quizio.ui.theme.Mor
import com.example.quizio.ui.theme.QuizioTheme
import com.example.quizio.ui.theme.arkaPlan

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuizioTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                        color = Color.White) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    val showSplash = remember { mutableStateOf(true) }
    splashScreen()
    /*LaunchedEffect(Unit) {
        Handler(Looper.getMainLooper()).postDelayed({
            showSplash.value = false
        },5000)
    }
    if(showSplash.value)
    {
        splashScreen()
    }
    else
    {

    }*/
}

@Composable
fun splashScreen()
{
    Box(modifier = Modifier
        .fillMaxSize().background(color = arkaPlan))
    {

    }
    Box(modifier = Modifier
        .fillMaxSize()
    ,contentAlignment = Alignment.CenterStart)
    {
        Image(painter = painterResource(id = R.drawable.icon1),
            modifier = Modifier.fillMaxSize(0.2f),
            contentDescription = "tanıtım",alignment = Alignment.Center)
    }

    Box(modifier = Modifier
        .fillMaxSize()
        ,contentAlignment = Alignment.CenterEnd)
    {
        Image(painter = painterResource(id = R.drawable.icon2),
            modifier = Modifier.fillMaxSize(0.2f).padding(top = 70.dp),
            contentDescription = "tanıtım",alignment = Alignment.CenterEnd)
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        Column(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(1f),horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top) {
            Image(painter = painterResource(id = R.drawable.onboardingimg),
                contentDescription = "tanıtım", modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.6f),
                alignment = Alignment.TopStart)
            LazyRow(verticalAlignment = Alignment.CenterVertically,
                userScrollEnabled = true){
                item{
                    Column(modifier = Modifier
                        .fillMaxWidth(1f)
                        .padding(10.dp),horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "Quiz On the",style = typography.titleMedium,fontSize = 32.sp)
                        Spacer(modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(0.05f))
                        Text(text = "Answer a quiz for a shot at winning thrilling prizes! \n Test your knowledge and win big!",textAlign = TextAlign.Center
                            ,modifier = Modifier.padding(all = 5.dp))
                    }
                    Column(modifier = Modifier
                        .fillMaxWidth(1f)
                        .padding(10.dp),horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "Knowledge Boosting",style = typography.titleMedium,fontSize = 32.sp)
                        Spacer(modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(0.05f))
                        Text(text = "Find fun and interesting quizzes to boost \n up your knowledge",textAlign = TextAlign.Center
                            ,modifier = Modifier.padding(all = 5.dp))
                    }
                    Column(modifier = Modifier
                        .fillMaxWidth(1f)
                        .padding(10.dp),horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "Win Rewards Galore",style = typography.titleMedium,fontSize = 32.sp)
                        Spacer(modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(0.05f))
                        Text(text = "Answer a quiz for a shot at winning thrilling prizes! Test \n your knowledge and win big!",textAlign = TextAlign.Center
                            ,modifier = Modifier.padding(all = 5.dp))
                    }
                }
            }
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.6f))
            Row(modifier = Modifier.fillMaxWidth(1f).padding(start = 10.dp,end = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween) {
                OutlinedButton(border = BorderStroke(width = 1.dp,color = Mor),
                    onClick = {  }) {
                    Text(text = "Skip", color = Color.Blue)
                }
                Button(colors =  ButtonDefaults.buttonColors(containerColor = Mor),
                    onClick = {  }) { Text(text = "Get Started") }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuizioTheme {
        MainScreen()
    }
}