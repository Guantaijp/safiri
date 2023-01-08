package com.example.safiri.view.BusBooking

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

import com.example.safiri.R
import com.example.safiri.navigation.NavScreens.*

@Composable
fun body(navController: NavController) {
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()

    Scaffold(
        scaffoldState = scaffoldState,

        content = {

            Column(

                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.White)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.img),
                    contentDescription = "About Safiri",
                    modifier = Modifier
                        .fillMaxWidth()
                )

                //create a card for the about safiri

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                        .height(90.dp)
                        .clickable {
                            //navigate to the next screen
                            navController.navigate("bookBus")
                        },
                    elevation = 8.dp

                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        horizontalArrangement = Arrangement.SpaceBetween

                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.bus_icon),
                            contentDescription = "Bus Icon",
                            modifier = Modifier
                                .padding(16.dp)
                                .size(45.dp)
                                .align(Alignment.CenterVertically),
                            tint = MaterialTheme.colors.primary
                        )
                        Text(
                            text = "Book Bus",
                            modifier = Modifier
                                .padding(16.dp)
                                .align(Alignment.CenterVertically),
                            style = MaterialTheme.typography.h6,
                            fontFamily = MaterialTheme.typography.h6.fontFamily
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.next),
                            contentDescription = "Bus Icon",
                            modifier = Modifier
                                .padding(16.dp)
                                .size(45.dp)
                                .align(Alignment.CenterVertically),
                            tint = MaterialTheme.colors.primary
                        )

                    }
                }
                //create a card for the about safiri

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                        .height(90.dp)
                        .clickable {
                            //TODO

                        },
                    elevation = 8.dp

                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        horizontalArrangement = Arrangement.SpaceBetween

                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.hotel_icon),
                            contentDescription = "Bus Icon",
                            modifier = Modifier
                                .padding(16.dp)
                                .size(45.dp)
                                .align(Alignment.CenterVertically),
                            tint = MaterialTheme.colors.primary
                        )
                        Text(
                            text = "Book BnB",
                            modifier = Modifier
                                .padding(16.dp)
                                .align(Alignment.CenterVertically),
                            style = MaterialTheme.typography.h6,
                            fontFamily = MaterialTheme.typography.h6.fontFamily
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.next),
                            contentDescription = "Bus Icon",
                            modifier = Modifier
                                .padding(16.dp)
                                .size(45.dp)
                                .align(Alignment.CenterVertically),
                            tint = MaterialTheme.colors.primary
                        )

                    }
                }

            }




        }
    )
}

//drawerContent = {
//    DrawerContent()
//},
//content = {
//    NavigationGraph(navController = navController, scaffoldState = scaffoldState, scope = coroutineScope)
//}
