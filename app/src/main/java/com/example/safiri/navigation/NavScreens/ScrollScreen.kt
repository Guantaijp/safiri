package com.example.safiri.navigation.NavScreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.safiri.view.BookBus
import com.example.safiri.view.BusBooking.body

@Composable
fun ScrollScreen() {
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()

    val navController = rememberNavController()


    Scaffold(
        scaffoldState= scaffoldState,
      topBar = { TopBarr(scaffoldState, scope,navController) },
        content = {padding ->
            Box(modifier = Modifier.padding(padding)){
                NavigationGraph(navController = navController, scaffoldState = scaffoldState, scope = scope)
            }
        },
        drawerContent = {
  DrawerContent(navController = navController)
        },
        bottomBar = { BottomNavigationBar(navController) },

    )


}
