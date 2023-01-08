package com.example.safiri.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.safiri.R

@Composable
fun BookBus(navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp, start = 10.dp, end = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Nairobi -> Mombasa",
                color = Color.Black,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding()
            )
            Text(
                text = "12 May 2021",
                color = Color.Black,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = 10.dp)
            )

        }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .clickable {
                    //navigate to the next screen
                    navController.navigate("buslook")
                },
            elevation = 4.dp
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            ) {
                Row(
                    modifier = Modifier
                        .padding(top = 5.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start

                ) {
                    Icon(
                        painter = painterResource(
                            id = com.example.safiri.R.drawable.bus),
                        contentDescription = "Bus",
                        modifier = Modifier
                            .size(22.dp),
                        tint = MaterialTheme.colors.primary
                    )
                    Row(
                        horizontalArrangement = Arrangement.Start,
                        modifier = Modifier.padding(start = 10.dp)
                    ) {
                        Text(
                            text = "Msafiri",
                            modifier = Modifier,
                        )
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                          Image(
                              painter = painterResource(id = R.drawable.logo),
                              contentDescription = "Star",
                              modifier = Modifier
                                  .size(28.dp)
                                  .align(Alignment.CenterEnd)
                          )
                        }
                    }
                }
                Row(
                    modifier = Modifier
                        .padding(top = 5.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Icon(
                        painter = painterResource(
                            id = com.example.safiri.R.drawable.time),
                        contentDescription = "Bus",
                        modifier = Modifier
                            .size(20.dp),

                        tint = MaterialTheme.colors.primary

                    )
                    Text(
                        text = "Time: 17:30:00",
                        modifier = Modifier

                    )
                    Text(
                        text = "7 seats",
                        modifier = Modifier
                            .padding(start = 20.dp)
                    )
                    Text(
                        text = "ksh 700",
                        modifier = Modifier
                            .padding(start = 20.dp),

                        )
                }
                Row(
                    modifier = Modifier
                        .padding(top = 5.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start

                ) {
                    Icon(
                        painter = painterResource(
                            id = com.example.safiri.R.drawable.boarding_point),
                        contentDescription = "Bus",
                        modifier = Modifier
                            .size(24.dp),
                        tint = MaterialTheme.colors.primary
                    )
                    Row(
                        horizontalArrangement = Arrangement.Start,
                        modifier = Modifier.padding(start = 10.dp)
                    ) {
                        Text(
                            text = "Boarding point",
                            modifier = Modifier,
                        )
                        Box(
                           modifier = Modifier
                               .fillMaxWidth()
                        ) {
                            Text(
                                text = "KenCom",
                                modifier = Modifier.align(Alignment.TopEnd)


                            )
                        }
                    }
                }
                //create a line
                Divider(
                    modifier = Modifier
                        .fillMaxWidth()

                )
             //   create the rating bar stars
                Row(
                    modifier = Modifier
                        .padding(top = 5.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start

                ) {
                    Icon(
                        painter = painterResource(
                            id = com.example.safiri.R.drawable.star),
                        contentDescription = "Bus",
                        modifier = Modifier
                            .size(24.dp),
                        tint = MaterialTheme.colors.primary
                    )
                    Row(
                        horizontalArrangement = Arrangement.Start,
                        modifier = Modifier.padding(start = 10.dp)
                    ) {
                        Text(
                            text = "Rating",
                            modifier = Modifier,
                        )
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Text(
                                text = "4.5",
                                modifier = Modifier.align(Alignment.TopEnd))
            }
        }
    }
            } }
    }
}


