package com.example.quizio.screens

import android.R.attr.fontWeight
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.quizio.R
import com.example.quizio.ui.theme.Mor
import com.example.quizio.ui.theme.arkaPlan
import com.example.quizio.ui.theme.kırlıBeyaz

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen()
{
    Scaffold(modifier = Modifier.fillMaxSize(1f).background(color = kırlıBeyaz),
            topBar = {
                TopAppBar(
                    title = {
                        Text(text = "Sign In")
                    },
                    colors = TopAppBarDefaults.topAppBarColors(
                            containerColor = Mor,
                            titleContentColor = Color.White),
                    navigationIcon = {
                        Icon(
                            modifier = Modifier.padding(10.dp).clickable { },
                            imageVector = Icons.AutoMirrored.Outlined.ArrowBack,
                            contentDescription = "Back",
                            tint = Color.White
                        )
                    },
                    modifier = Modifier.padding(start = 10.dp)
                )
            }
    ){ it
        Box(modifier = Modifier.fillMaxSize(1f))
        {
            Column(modifier = Modifier.fillMaxSize(1f).background(color = kırlıBeyaz)) {
                Box(modifier = Modifier.fillMaxWidth(1f).fillMaxHeight(0.3f)
                    .clip(RoundedCornerShape(bottomEnd = 60.dp, bottomStart = 60.dp))
                    .background(color = Mor)
                    .border(width = 0.dp,
                    color = Mor,
                    shape = RoundedCornerShape(bottomEnd = 60.dp, bottomStart = 60.dp))){
                }
                Box(modifier = Modifier.fillMaxWidth(1f).fillMaxHeight(1f).background(color = kırlıBeyaz)){}
            }
        }

        Column(modifier = Modifier.fillMaxSize(1f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceEvenly) {
            Box(modifier = Modifier.fillMaxWidth(0.8f).fillMaxHeight(0.4f).padding(top = 50.dp).background(color = Color.White)){
                Column(modifier = Modifier.fillMaxSize(1f),
                    horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceEvenly) {

                    Row(modifier = Modifier.fillMaxWidth(1f).background(color = Color.Blue))
                    {
                        Button(modifier = Modifier.fillMaxWidth(0.5f),
                            colors =  ButtonDefaults.buttonColors(containerColor = Color.White),
                            onClick = {  }) { Text(text = "Sign In", color = Color.Black) }
                        Button(modifier = Modifier.fillMaxWidth(1f),
                            colors =  ButtonDefaults.buttonColors(containerColor = Color.White),
                            onClick = {  }) { Text(text = "Sign Up", color = Color.Black) }
                    }
                    Text("Email",modifier = Modifier.fillMaxWidth(0.8f),fontWeight = FontWeight.Bold)
                    OutlinedTextField(
                        value = "",
                        onValueChange = {  },
                        label = { Text("Email") }
                    )
                    Text("Password",modifier = Modifier.fillMaxWidth(0.8f),fontWeight = FontWeight.Bold)
                    OutlinedTextField(
                        value = "",
                        onValueChange = {  },
                        label = { Text("Password") }
                    )

                    Text("Forgot password?",modifier = Modifier.fillMaxWidth(0.8f), textAlign = TextAlign.End)
                }
            }

            Button(modifier = Modifier.fillMaxWidth(0.8f),colors =  ButtonDefaults.buttonColors(containerColor = Mor),
                onClick = {  }) { Text(text = "Sign In") }

            Row(modifier = Modifier.fillMaxWidth(1f), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){
                Spacer(modifier = Modifier.background(color = Color.Black).width(100.dp).height(0.5.dp))
                Spacer(modifier = Modifier.width(10.dp).height(20.dp))
                Text(text = "Or Continue With")
                Spacer(modifier = Modifier.width(10.dp).height(20.dp))
                Spacer(modifier = Modifier.background(color = Color.Black).width(100.dp).height(0.5.dp))
            }

            Box(modifier = Modifier.fillMaxWidth(0.8f)){
                Column(modifier = Modifier.fillMaxWidth(1f),
                    horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                    OutlinedButton(modifier = Modifier.fillMaxWidth(1f),border = BorderStroke(width = 1.dp,color = Mor),
                        onClick = {  }) {
                        Image(painter = painterResource(id = R.drawable.google),
                            modifier = Modifier.fillMaxSize(0.08f).padding(end = 6.dp),
                            contentDescription = "Google",alignment = Alignment.Center)
                        Text(text = "Continue With", color = Color.Blue)
                    }
                    Spacer(modifier = Modifier.fillMaxWidth(1f).height(20.dp))
                    OutlinedButton(modifier = Modifier.fillMaxWidth(1f),border = BorderStroke(width = 1.dp,color = Mor),
                        onClick = {  }) {
                        Image(painter = painterResource(id = R.drawable.apple),
                            modifier = Modifier.fillMaxSize(0.09f).padding(end = 6.dp),
                            contentDescription = "Apple",alignment = Alignment.Center)
                        Text(text = "Continue With", color = Color.Blue)
                    }
                }
            }

            Text(text = "Don’t have an account?")

        }

    }
}

@Composable
@Preview(showBackground = true)
fun previewHome(){
    LoginScreen()
}