package com.example.roomsiswa.repositori

import com.example.roomsiswa.data.Siswa
import com.example.roomsiswa.data.SiswaDao

class OfflineRepositoriSiswa (private val siswaDao: SiswaDao) : RepositoriSiswa {
    override fun getAllSiswaStream() = siswaDao.getAllSiswa()

    override fun getSiswaStream(id: Int) = siswaDao.getSiswa(id)

    override suspend fun insertSiswa(siswa: Siswa) = siswaDao.insert(siswa)

    override suspend fun updateSiswa(siswa: Siswa) = siswaDao.update(siswa)

    override suspend fun deleteSiswa(siswa: Siswa) = siswaDao.delete(siswa)

}