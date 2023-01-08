package com.example.safiri.view.BusBooking

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.safiri.R

@Composable
fun BusDetails() {
    Column(

        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
            .background(Color.White)
            .verticalScroll(rememberScrollState())
    ) {
        Column(
            modifier = Modifier

                .fillMaxWidth()
                .background(color = MaterialTheme.colors.primary),
            //arrange center
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()

            ){
                Column() {
                    //bus image
                    Image(
                        painter = painterResource(id = R.drawable.bus_header2),
                        contentDescription = "About Safiri",
                        modifier = Modifier
                            .fillMaxWidth()
                    )

                    Text(
                        text = "Msafiri",
                        color = Color.White,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding()
                    )
                    //bus company name
                    Text(
                        text = "Astron Bus",
                        color = Color.White,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(start = 10.dp)
                    )
                    //bus destination
                    Text(
                        text = "Nairobi -> Mombasa",
                        color = Color.White,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(start = 10.dp)
                    )
                    //bus number plate
                    Text(
                        text = "KCM 269P",
                        color = Color.White,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(start = 10.dp)
                    )
                    //bus departure time
                    Text(
                        text = "12 May 2021",
                        color = Color.White,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(start = 10.dp),

                    )

                }

            }
        }
        Card (
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .height(40.dp),
            elevation = 2.dp,

                ){
            Column(
                modifier = Modifier

                    .fillMaxWidth(),

                //arrange center
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
            Text(text = "River Road, Nairobi / Accra Road",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(start = 10.dp, top = 10.dp),
                color = Color.Black
            )
        }
    }

        Card (
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                ,
            elevation = 2.dp,

            ){
            Column(
                modifier = Modifier

                    .fillMaxWidth(),

                //arrange center
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Wi-fi available",
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(start = 10.dp, top = 10.dp),
                    color = Color.Black
                )
                Text(text = "Snacks Served",
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(start = 10.dp, top = 10.dp),
                    color = Color.Black
                )
                Text(text = "Stop over in Mutito Andei",
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(start = 10.dp, top = 10.dp),
                    color = Color.Black
                )
                Text(text = "Check in 15 minutes before departure",
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(start = 10.dp, top = 10.dp),
                    color = Color.Black
                )
            }

    }
}}