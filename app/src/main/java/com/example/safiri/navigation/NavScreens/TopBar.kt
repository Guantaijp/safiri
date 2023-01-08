package com.example.safiri.navigation.NavScreens

import android.text.style.ClickableSpan
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.safiri.R
import com.example.safiri.navigation.NavigationItem
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch


@Composable
    fun TopBarr(scaffoldState: ScaffoldState, scope: CoroutineScope,navController: NavController) {
    TopAppBar(
        title={

            val items = listOf(
                NavigationItem.Home,
                NavigationItem.MyBooking,
                NavigationItem.Account,
            )

              val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentRoute = navBackStackEntry?.destination?.route
                items.forEach { item ->
                    if (currentRoute == item.route){
                        Text(text = item.title,
                            modifier = Modifier
                                .padding(start = 5.dp),
                            color = Color.White
                        )
                    }
                }
        },
        navigationIcon = {
            IconButton(
                onClick = {
                    scope.launch {
                        scaffoldState.drawerState.open()
                    }
                },
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_baseline_dehaze_24),
                    contentDescription = "menu",
                    tint = Color.White,
                    modifier = Modifier
                        .size(30.dp)
                )
            }
        },
        backgroundColor = colorResource(id = R.color.md_green_200)
        )
}