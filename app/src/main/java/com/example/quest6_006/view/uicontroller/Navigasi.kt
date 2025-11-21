package com.example.quest6_006.view.uicontroller

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.quest6_006.view.FormIsian
import com.example.quest6_006.view.TampilanData

enum class Navigasi {
    Formulirku,
    Detail
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
){
    Scaffold { isiRuang->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Formulirku.name,

            modifier = Modifier.padding(paddingValues = isiRuang)) {
            composable(route = Navigasi.Formulirku.name) {
                FormIsian(
                    OnSubmitBtnClick = {
                        navController.navigate(route = Navigasi.Detail.name)
                    }
                )
            }
            composable(route = Navigasi.Detail.name) {
                TampilanData(
                    onBackBtnClick = {
                        cancelAndBackToFormulir(navController)
                    }
                )
            }
        }
    }
}



private fun cancelAndBackToFormulir(
    navController: NavHostController
){
    navController.popBackStack(route = Navigasi.Formulirku.name, inclusive = false)
}