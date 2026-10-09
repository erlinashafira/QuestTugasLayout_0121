package com.example.prak4tugas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import com.example.prak4tugas.ui.theme.Prak4TugasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Prak4TugasTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    MainScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(dimensionResource(id = R.dimen.spacing_medium)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ){
            Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacing_large)))

            Text(
                text = stringResource(id = R.string.header_title),
                fontSize = dimensionResource(id = R.dimen.text_title_size).value.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            Text(
                text = stringResource(id = R.string.header_subtitle),
                fontSize = dimensionResource(id = R.dimen.text_subtitle_size).value.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacing_large)))

            ProfileCard(
                cardColor = colorResource(id = R.color.card_gray),
                name = stringResource(id = R.string.name_1),
                phone = stringResource(id = R.string.phone_1),
                address = stringResource(id = R.string.address_1),
                textColor = Color.Black,
                subTextColor = Color.DarkGray,
                logoResId = R.drawable.logo_umy
            )
            Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacing_small)))

            ProfileCard(
                cardColor = colorResource(id = R.color.card_purple),
                name = stringResource(id = R.string.name_2),
                phone = stringResource(id = R.string.phone_2),
                address = stringResource(id = R.string.address_2),
                textColor = colorResource(id = R.color.text_white),
                subTextColor = colorResource(id = R.color.text_yellow),
                logoResId = R.drawable.logo_umy
            )
            Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacing_small)))

            ProfileCard(
                cardColor = colorResource(id = R.color.card_blue),
                name = stringResource(id = R.string.name_3),
                phone = stringResource(id = R.string.phone_3),
                address = stringResource(id = R.string.address_3),
                textColor = colorResource(id = R.color.text_white),
                subTextColor = colorResource(id = R.color.text_white),
                logoResId = R.drawable.logo_umy
            )
            Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacing_small)))

            ProfileCard(
                cardColor = colorResource(id = R.color.card_green),
                name = stringResource(id = R.string.name_4),
                phone = stringResource(id = R.string.phone_4),
                address = stringResource(id = R.string.address_4),
                textColor = Color.Black,
                subTextColor = Color.DarkGray,
                logoResId = R.drawable.logo_umy
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Prak4TugasTheme {
        Greeting("Android")
    }
}