package com.example.roomsiswa.model

import android.text.Spannable.Factory
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.kotlin_repo.model.EntryViewModel
import com.example.roomsiswa.AplikasiSiswa

object PenyediaViewModel {
val Factory = viewModelFactory {
    initializer {
        HomeViewModel(AplikasiSiswa().container.repositoriSiswa)
    }
    initializer {
        EntryViewModel(AplikasiSiswa().container.repositoriSiswa)
    }
}
}

fun CreationExtras.aplikasiSiswa(): AplikasiSiswa =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiSiswa)