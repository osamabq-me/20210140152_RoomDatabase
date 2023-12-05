package com.example.roomsiswa.ui.theme.Halaman

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.kotlin_repo.model.EntryViewModel
import com.example.roomsiswa.R
import com.example.roomsiswa.model.PenyediaViewModel
import com.example.roomsiswa.navigasi.DestinasiNavigasi

object DestinasiEntry : DestinasiNavigasi {
    override val route = "item_entry"
    override val titleRes = R.string.entry_siswa

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EntrySiswaScreen(
    navigasiBack: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: EntryViewModel = viewModel(factory = PenyediaViewModel.Factory)
) {
    val coroutineScope = rememberCoroutineScope()
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
}

