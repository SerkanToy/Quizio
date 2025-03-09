package com.example.quizio.screens

import android.util.Log
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quizio.R
import com.example.quizio.ui.theme.Mor
import com.example.quizio.ui.theme.grii
import com.example.quizio.ui.theme.kırlıBeyaz

@Composable
fun RegisterScreen()
{
    SignUp()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUp()
{
    Scaffold(modifier = Modifier.fillMaxSize(1f).background(color = kırlıBeyaz),
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Sign Up")
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

        Column(modifier = Modifier.fillMaxSize(1f).padding(top = 140.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceBetween) {
            Box(modifier = Modifier.fillMaxWidth(0.8f).fillMaxHeight(0.60f).background(color = Color.White)){
                Column(modifier = Modifier.fillMaxSize(1f),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly) {

                    Row(modifier = Modifier.fillMaxWidth(1f))
                    {
                        Button(modifier = Modifier.fillMaxWidth(0.5f),
                            colors =  ButtonDefaults.buttonColors(containerColor = Color.White),
                            onClick = {
                                Log.e("singin","singin tıklandı")
                            }) { Text(text = "Sign In", color = grii, fontSize = 20.sp) }
                        Spacer(modifier = Modifier.width(1.dp).height(40.dp).background(color = kırlıBeyaz))
                        Button(modifier = Modifier.fillMaxWidth(1f),
                            colors =  ButtonDefaults.buttonColors(containerColor = Color.White),
                            onClick = {
                                Log.e("singup","singup tıklandı")
                            }) { Text(text = "Sign Up", color = Mor, fontSize = 20.sp) }
                    }
                    Text("Fullname",modifier = Modifier.fillMaxWidth(1f).padding(start = 17.dp),fontWeight = FontWeight.Medium)
                    OutlinedTextField(modifier = Modifier.fillMaxWidth(1f).padding(start = 17.dp, end = 17.dp),
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Person,
                                contentDescription = null,
                                tint = grii
                            )
                        },
                        value = "",
                        onValueChange = {  },
                        label = { Text("Fullname", color = grii) }
                    )
                    Text("EMail",modifier = Modifier.fillMaxWidth(1f).padding(start = 17.dp),fontWeight = FontWeight.Bold)
                    OutlinedTextField(
                        modifier = Modifier.fillMaxWidth(1f).padding(start = 17.dp, end = 17.dp),
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Email,
                                contentDescription = null,
                                tint = grii
                            )
                        },
                        value = "",
                        onValueChange = {  },
                        label = { Text("EMail", color = grii) }
                    )
                    Text("Password",modifier = Modifier.fillMaxWidth(1f).padding(start = 17.dp),fontWeight = FontWeight.Bold)
                    OutlinedTextField(
                        modifier = Modifier.fillMaxWidth(1f).padding(start = 17.dp, end = 17.dp),
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Lock,
                                contentDescription = null,
                                tint = grii
                            )
                        },
                        value = "",
                        onValueChange = {  },
                        label = { Text("Password", color = grii) }
                    )

                    Row(modifier = Modifier.fillMaxWidth(1f).padding(start = 20.dp, end = 20.dp),horizontalArrangement = Arrangement.SpaceBetween) {
                        Row (modifier = Modifier.fillMaxWidth(0.5f).padding(end = 5.dp).border(width = 1.dp,
                            color = grii,
                            shape = RoundedCornerShape(bottomEnd = 30.dp, bottomStart = 30.dp, topStart = 30.dp, topEnd = 30.dp)),
                            verticalAlignment = Alignment.CenterVertically) {
                            RadioButton(
                                selected = true,
                                onClick = {  },
                                enabled = true,
                                colors = RadioButtonDefaults.colors(
                                    unselectedColor = grii,
                                    selectedColor = grii
                                )
                            )//RadioButton
                            Text(text = "Men", modifier = Modifier.padding(start = 8.dp))
                        }
                        Row(modifier = Modifier.fillMaxWidth(1f).padding(start = 5.dp).border(width = 1.dp,
                            color = grii,
                            shape = RoundedCornerShape(bottomEnd = 30.dp, bottomStart = 30.dp, topStart = 30.dp, topEnd = 30.dp)), verticalAlignment = Alignment.CenterVertically) {
                            RadioButton(
                                selected = false,
                                onClick = {  },
                                enabled = true,
                                colors = RadioButtonDefaults.colors(
                                    unselectedColor = grii,
                                    selectedColor = grii
                                )
                            )//RadioButton
                            Text(text = "Women", modifier = Modifier.padding(start = 8.dp))
                        }
                    }

                    Row (modifier = Modifier.fillMaxWidth(1f).padding(start = 12.dp),
                        verticalAlignment = Alignment.CenterVertically) {
                        RadioButton(
                            selected = true,
                            onClick = {  },
                            enabled = true,
                            colors = RadioButtonDefaults.colors(
                                selectedColor = grii
                            )
                        )//RadioButton
                        Text(text = "I accept to all Term, Privacy and Fees", modifier = Modifier.padding(start = 1.dp))
                    }
                }
            }

            Button(modifier = Modifier.fillMaxWidth(0.8f),colors =  ButtonDefaults.buttonColors(containerColor = Mor),
                onClick = {  }) { Text(text = "Sign Up") }

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

            Text(text = "Already have an account?")

        }

    }
}