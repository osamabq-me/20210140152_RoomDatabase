package com.example.roomsiswa.model

import androidx.lifecycle.ViewModel
import com.example.kotlin_repo.data.Siswa
import com.example.kotlin_repo.repositori.RepositoriSiswa


class HomeViewModel(private val repositoriSiswa: RepositoriSiswa): ViewModel(){
    companion object {
        private const val TIMEOUT_MILLIS = 5_000L
    }


    data class HomeUiState(
        val listSiswa: List<Siswa> = listOf()
    )

}