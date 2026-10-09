package com.example.prak4tugas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontFamily

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(dimensionResource(id = R.dimen.spacing_medium)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Spacer(
                modifier = Modifier.height(
                    dimensionResource(id = R.dimen.spacing_large)
                )
            )

            Text(
                text = stringResource(id = R.string.header_title),
                fontSize = dimensionResource(
                    id = R.dimen.text_title_size
                ).value.sp,
                fontWeight = getFontWeight(
                    stringResource(id = R.string.font_bold)
                ),
                color = colorResource(id = R.color.text_black)
            )

            Text(
                text = stringResource(id = R.string.header_subtitle),
                fontSize = dimensionResource(
                    id = R.dimen.text_subtitle_size
                ).value.sp,
                fontWeight = getFontWeight(
                    stringResource(id = R.string.font_medium)
                ),
                color = colorResource(id = R.color.text_black)
            )

            Spacer(
                modifier = Modifier.height(
                    dimensionResource(id = R.dimen.spacing_large)
                )
            )

            ProfileCard(
                cardColor = colorResource(id = R.color.card_gray),
                name = stringResource(id = R.string.name_1),
                phone = stringResource(id = R.string.phone_1),
                address = stringResource(id = R.string.address_1),
                textColor = colorResource(id = R.color.text_black),
                subTextColor = colorResource(id = R.color.text_dark_gray),
                logoResId = R.drawable.logo_umy,
                nameFontFamily = FontFamily.Cursive
            )

            Spacer(
                modifier = Modifier.height(
                    dimensionResource(id = R.dimen.spacing_small)
                )
            )

            ProfileCard(
                cardColor = colorResource(id = R.color.card_purple),
                name = stringResource(id = R.string.name_2),
                phone = stringResource(id = R.string.phone_2),
                address = stringResource(id = R.string.address_2),
                textColor = colorResource(id = R.color.text_white),
                subTextColor = colorResource(id = R.color.text_yellow),
                logoResId = R.drawable.logo_umy
            )

            Spacer(
                modifier = Modifier.height(
                    dimensionResource(id = R.dimen.spacing_small)
                )
            )

            ProfileCard(
                cardColor = colorResource(id = R.color.card_blue),
                name = stringResource(id = R.string.name_3),
                phone = stringResource(id = R.string.phone_3),
                address = stringResource(id = R.string.address_3),
                textColor = colorResource(id = R.color.text_white),
                subTextColor = colorResource(id = R.color.text_white),
                logoResId = R.drawable.logo_umy
            )

            Spacer(
                modifier = Modifier.height(
                    dimensionResource(id = R.dimen.spacing_small)
                )
            )

            ProfileCard(
                cardColor = colorResource(id = R.color.card_green),
                name = stringResource(id = R.string.name_4),
                phone = stringResource(id = R.string.phone_4),
                address = stringResource(id = R.string.address_4),
                textColor = colorResource(id = R.color.text_black),
                subTextColor = colorResource(id = R.color.text_dark_gray),
                logoResId = R.drawable.logo_umy,
            )
        }

        Text(
            text = stringResource(id = R.string.footer_copyright),
            fontSize = dimensionResource(
                id = R.dimen.text_footer_size
            ).value.sp,
            color = colorResource(id = R.color.text_black),
            modifier = Modifier.padding(
                bottom = dimensionResource(id = R.dimen.spacing_medium)
            )
        )
    }
}

@Composable
fun ProfileCard(
    cardColor: Color,
    name: String,
    phone: String,
    address: String,
    textColor: Color,
    subTextColor: Color,
    logoResId: Int,
    nameFontFamily: FontFamily = FontFamily.Default
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(dimensionResource(id = R.dimen.card_height)),
        shape = RoundedCornerShape(
            dimensionResource(id = R.dimen.card_corner_radius)
        ),
        colors = CardDefaults.cardColors(
            containerColor = cardColor
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    horizontal = dimensionResource(
                        id = R.dimen.spacing_medium
                    )
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = logoResId),
                contentDescription = null,
                modifier = Modifier.size(
                    dimensionResource(id = R.dimen.logo_size)
                )
            )

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(
                        horizontal = dimensionResource(
                            id = R.dimen.spacing_small
                        )
                    ),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = name,
                    color = textColor,
                    fontSize = dimensionResource(
                        id = R.dimen.text_name_size
                    ).value.sp,
                    fontWeight = getFontWeight(
                        stringResource(id = R.string.font_bold)
                    ),
                    fontFamily = nameFontFamily
                )

                if (phone.isNotEmpty()) {
                    Text(
                        text = phone,
                        color = subTextColor,
                        fontSize = dimensionResource(
                            id = R.dimen.text_detail_size
                        ).value.sp
                    )
                }

                if (address.isNotEmpty()) {
                    Text(
                        text = address,
                        color = subTextColor,
                        fontSize = dimensionResource(
                            id = R.dimen.text_detail_size
                        ).value.sp
                    )
                }
            }

            Image(
                painter = painterResource(id = logoResId),
                contentDescription = null,
                modifier = Modifier.size(
                    dimensionResource(id = R.dimen.logo_size)
                )
            )
        }
    }
}

@Composable
fun getFontWeight(fontName: String): FontWeight {
    return when (fontName) {
        stringResource(id = R.string.font_bold) ->
            FontWeight.Bold

        stringResource(id = R.string.font_medium) ->
            FontWeight.Medium

        else -> FontWeight.Normal
    }
}