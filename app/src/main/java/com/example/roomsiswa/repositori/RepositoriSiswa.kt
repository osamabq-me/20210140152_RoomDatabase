package com.example.kotlin_repo.repositori

import com.example.kotlin_repo.data.Siswa
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>

    fun getSiswaStream(id: Int): Flow<Siswa>

    suspend fun insertSiswa(siswa: Siswa)

    suspend fun updateSiswa(siswa: Siswa)

    suspend fun deleteSiswa(siswa: Siswa)
}