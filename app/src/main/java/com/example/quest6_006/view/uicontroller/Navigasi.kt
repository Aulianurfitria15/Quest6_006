package com.example.quest6_006.view.uicontroller

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.quest6_006.model.DataJK.JenisK
import com.example.quest6_006.view.FormSiswa
import com.example.quest6_006.view.TampilanSiswa
import com.example.quest6_006.viewmodel.SiswaViewModel

enum class Navigasi {
    Formulirku,
    Detail
}

@Composable
fun SiswaApp(
    modifier: Modifier,
    viewModel: SiswaViewModel = viewModel (),
    navController: NavHostController = rememberNavController()
){
    Scaffold { isiRuang->
        val uiState = viewModel.statusUI.collectAsState()
