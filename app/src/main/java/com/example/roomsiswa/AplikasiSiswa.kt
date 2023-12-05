package com.example.roomsiswa

import android.app.Application
import com.example.kotlin_repo.repositori.ContainerApp
import com.example.kotlin_repo.repositori.ContainerDataApp

class AplikasiSiswa : Application() {


    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}