package com.tutorials.composetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tutorials.composetest.ui.theme.ComposeTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            Column {
//                Column(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .height(200.dp)
//                        .border(border = BorderStroke(width = 1.dp, color = Color.Black)),
//                    verticalArrangement = Arrangement.Center
//                ) {
//                    Text(text = "Item 1", modifier = Modifier.align(Alignment.CenterHorizontally))
//                    Text(text = "Item 2", modifier = Modifier.align(Alignment.CenterHorizontally))
//                }
//
//                Spacer(modifier = Modifier.padding(20.dp))
//
//                Row(
//                    modifier = Modifier
//                        .width(200.dp)
//                        .height(200.dp)
//                        .border(border = BorderStroke(width = 1.dp, color = Color.Black)),
//                    horizontalArrangement = Arrangement.Center
//                ) {
//                    Text(text = "Item 2", modifier = Modifier.align(Alignment.CenterVertically))
//                }
//            }


            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .background(color = Color(0xFFF2F2F2))
                    .fillMaxSize()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.happy_meal_small),
                    contentDescription = "content desc",
                    modifier = Modifier.height(300.dp),
                    contentScale = ContentScale.Crop,
                )
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Dimbua Kuku",
                            style = TextStyle(fontSize = 26.sp)
                        )
                        Text(
                            text = "$5.99",
                            style = TextStyle(color = Green, fontSize = 17.sp),
                            modifier = Modifier.align(Alignment.CenterVertically)
                        )
                    }
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(text = "500 Cal", style = TextStyle(fontSize = 17.sp))
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Button(onClick = { /*TODO*/ },modifier = Modifier.align(alignment = Alignment.CenterHorizontally)) {
                        Text(text = "Order Now")
                    }
                }
            }
        }
    }
}