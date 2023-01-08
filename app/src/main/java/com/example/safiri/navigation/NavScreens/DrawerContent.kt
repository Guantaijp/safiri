package com.example.safiri.navigation.NavScreens

import android.R
import androidx.compose.foundation.*

import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import kotlinx.coroutines.launch


@Composable
fun DrawerContent(navController: NavController) {
    //scrolable drawer
    val scrollState = rememberScrollState()
    val coroutineScope = rememberCoroutineScope()
    Column (
        modifier = Modifier

            ) {
        val image = painterResource(com.example.safiri.R.drawable.bus_header2)
        Box(
            modifier = Modifier

        ) {
            Image(
                painter = image,
                contentScale = ContentScale.Inside,
                contentDescription = null
            )
            Column(
                modifier = Modifier

                    .padding(top = 50.dp),
                verticalArrangement = Arrangement.Bottom,
            ) {

                Icon(
                    painter = painterResource(id = com.example.safiri.R.drawable.ic_account),
                    contentDescription = "menu",
                    tint = Color.White,
                    modifier = Modifier
                        .size(50.dp)
                        .padding(start = 16.dp)
                )

                Text(modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp),
                    text = "Peter Mwangi",
                    color = Color.White,
                    fontSize = 14.sp
                )
                Text(modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp),
                    fontSize = 14.sp,
                    color = Color.White,
                    text = "+254 712 345 678")

            }

        }
        Text(text = "Tickets",
            modifier = Modifier
                .padding(start = 16.dp, top = 8.dp),
            color = Color(0xFF7A7E7D),
            fontSize = 14.sp
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp)
                .verticalScroll(scrollState)
        ) {

            //Row BookTicket
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
                    .height(50.dp)
                    .clickable { }
            ) {
                Icon(
                    painter = painterResource(
                        id = com.example.safiri.R.drawable.ticket),
                    contentDescription = "ticket",
                    tint = Color(0xFF43A047),
                    modifier = Modifier
                        .size(50.dp)
                        .padding(start = 16.dp)
                )
                Text(
                    text = "Book Ticket",
                    modifier = Modifier
                        .padding(start = 25.dp, end = 16.dp, top = 15.dp),
                    fontSize = 16.sp,

                    )
            }
            //Row My Bus Tickets
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .clickable { }
            ) {
                Icon(
                    painter = painterResource(
                        id = com.example.safiri.R.drawable.cancel_ticket),
                    contentDescription = "ticket",
                    tint = Color(0xFF43A047),
                    modifier = Modifier
                        .size(50.dp)
                        .padding(start = 16.dp)
                )
                Text(
                    text = "My Bus Tickets",
                    modifier = Modifier
                        .padding(start = 25.dp, end = 16.dp, top = 15.dp),
                    fontSize = 16.sp,

                    )
            }
            //Row My BNB TICKets
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .clickable { }
            ) {
                Icon(
                    painter = painterResource(
                        id = com.example.safiri.R.drawable.cancel_ticket),
                    contentDescription = "ticket",
                    tint = Color(0xFF43A047),
                    modifier = Modifier
                        .size(50.dp)
                        .padding(start = 16.dp)
                )
                Text(
                    text = "My BNB Tickets",
                    modifier = Modifier
                        .padding(start = 25.dp, end = 16.dp, top = 15.dp),
                    fontSize = 16.sp,

                    )
            }
            //Row My ACcount
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .clickable {
                        navController.navigate("account")
                    }
            ) {
                Icon(
                    painter = painterResource(
                        id = com.example.safiri.R.drawable.ic_outline_account),
                    contentDescription = "ticket",
                    tint = Color(0xFF43A047),

                    modifier = Modifier
                        .size(50.dp)
                        .padding(start = 16.dp)

                )
                Text(
                    text = "My Account",
                    modifier = Modifier
                        .padding(start = 25.dp, end = 16.dp, top = 15.dp),
                    fontSize = 16.sp,

                    )
            }
            //divider
            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp),
                color = Color(0xFF7A7E7D)
            )
            Text(text = "Communicate",
                modifier = Modifier
                    .padding(start = 16.dp, top = 8.dp),
                color = Color(0xFF7A7E7D),
                fontSize = 14.sp
            )
            //Wtrite feedback
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .clickable { }
            ) {
                Icon(
                    painter = painterResource(
                        id = com.example.safiri.R.drawable.write_feedback),
                    contentDescription = "ticket",
                    tint = Color(0xFF43A047),

                    modifier = Modifier
                        .size(50.dp)
                        .padding(start = 16.dp)

                )
                Text(
                    text = "Write Feedback",
                    modifier = Modifier
                        .padding(start = 25.dp, end = 16.dp, top = 15.dp),
                    fontSize = 16.sp,
                    color = Color(0xFF7A7E7D),

                    )
            }
            //FAQs
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .clickable { }
            ) {
                Icon(
                    painter = painterResource(
                        id = com.example.safiri.R.drawable.faq),
                    contentDescription = "ticket",
                    tint = Color(0xFF43A047),

                    modifier = Modifier
                        .size(50.dp)
                        .padding(start = 16.dp)

                )
                Text(
                    text = "FAQs",
                    modifier = Modifier
                        .padding(start = 25.dp, end = 16.dp, top = 15.dp),
                    fontSize = 16.sp,
                    color = Color(0xFF7A7E7D),
                    )
            }
            //Terms and Condition
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .clickable { }
            ) {
                Icon(
                    painter = painterResource(
                        id = com.example.safiri.R.drawable.terms),
                    contentDescription = "ticket",
                    tint = Color(0xFF43A047),

                    modifier = Modifier
                        .size(50.dp)
                        .padding(start = 16.dp)

                )
                Text(
                    text = "Terms & Conditions",
                    modifier = Modifier
                        .padding(start = 25.dp, end = 16.dp, top = 15.dp),
                    fontSize = 16.sp,
                    color = Color(0xFF7A7E7D),

                    )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .clickable { }
            ) {
                Icon(
                    painter = painterResource(
                        id = com.example.safiri.R.drawable.logout),
                    contentDescription = "ticket",
                    tint = Color(0xFF43A047),

                    modifier = Modifier
                        .size(50.dp)
                        .padding(start = 16.dp)

                )
                Text(
                    text = "Log Out",
                    modifier = Modifier
                        .padding(start = 25.dp, end = 16.dp, top = 15.dp),
                    fontSize = 16.sp,
                    color = Color(0xFF7A7E7D),

                    )
            }
        }

    }
        }


