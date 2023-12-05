package com.example.kotlin_repo.repositori

import com.example.kotlin_repo.data.Siswa
import com.example.kotlin_repo.data.SiswaDao

class OfflineRepositoriSiswa (private val siswaDao: SiswaDao) : RepositoriSiswa {
    override fun getAllSiswaStream() = siswaDao.getAllSiswa()

    override fun getSiswaStream(id: Int) = siswaDao.getSiswa(id)

    override suspend fun insertSiswa(siswa: Siswa) = siswaDao.insert(siswa)

    override suspend fun updateSiswa(siswa: Siswa) = siswaDao.update(siswa)

    override suspend fun deleteSiswa(siswa: Siswa) = siswaDao.delete(siswa)

}