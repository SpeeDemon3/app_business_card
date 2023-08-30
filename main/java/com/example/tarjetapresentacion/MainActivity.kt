package com.example.tarjetapresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetapresentacion.ui.theme.TarjetaPresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaPresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}


@Composable
fun BusinessCard(modifier: Modifier = Modifier) {

    val img = painterResource(R.drawable._657543305511)


    Box (
        Modifier
            .background(color = Color(0xFF3adc89))
            .fillMaxHeight()
            .fillMaxWidth()
        ) {
        Column (horizontalAlignment = Alignment.CenterHorizontally) {
            Image (
                painter = img,
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(start = 60.dp, end = 50.dp, bottom = 5.dp, top = 200.dp)
                    .width(250.dp)
                    .height(200.dp)
                    .align(CenterHorizontally)

            )

            GreetingName()

            GreetingTitle()

            Column (Modifier.padding(top = 50.dp)) {
                Icon1()
                Icon2()
                Icon3()
            }

        }
    }

}

@Composable
fun GreetingName() {
    Text(
        text = stringResource(R.string.name),
        fontFamily = FontFamily.Serif,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp,
        style = TextStyle(
            shadow = Shadow(
                color = Color.Green,
                blurRadius = 10f
            )
        )
    )
}

@Composable
fun GreetingTitle() {
    Text(
        text = stringResource(R.string.title),
        color = Color.Green,
        style = TextStyle(
            fontSize = 20.sp,
            shadow = Shadow(
                color = Color.Black,
                blurRadius = 20f
            )
            )
    )
}

@Composable
fun Icon1(modifier: Modifier = Modifier){
    Row {
            Icon(
                painter = painterResource(R.drawable.android_mobile_phone_22183),
                contentDescription = null,
            )

            Text(
                text = stringResource(R.string.phone),
                modifier.padding(30.dp),
                color = Color.Black
            )


    }
}

@Composable
fun Icon2(modifier: Modifier = Modifier) {

    Row {
        Icon(
            painter = painterResource(R.drawable.google_mail_gmail_logo_icon_159346),
            contentDescription = null
        )

        Text(
            text = stringResource(R.string.email),
            modifier.padding(15.dp),
            color = Color.Black
        )
    }

}

@Composable
fun Icon3(modifier: Modifier = Modifier) {
    Row {
        Icon(
            painter = painterResource(R.drawable.github_original_wordmark_logo_icon_146506),
            contentDescription = null
        )

        Text(
            text = stringResource(R.string.git),
            modifier.padding(10.dp),
            color = Color.Black
        )

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TarjetaPresentacionTheme {
        BusinessCard()
    }
}