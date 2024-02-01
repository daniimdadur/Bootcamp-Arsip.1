package com.latihanspringdasar1.model;

import com.latihanspringdasar1.util.MataPelajaran;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Kelas {
    public String namaKelas;
    public Guru guru;
    public MataPelajaran matPel;
    public String hari;
    public String waktu;
    public List<Siswa> siswa;
}
