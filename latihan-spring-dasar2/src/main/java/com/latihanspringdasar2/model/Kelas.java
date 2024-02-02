package com.latihanspringdasar2.model;

import com.latihanspringdasar2.utils.MataPelajaran;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Kelas {
    public String kode;
    public Dosen dosen;
    public MataPelajaran matKul;
    public String hari;
    public List<Mahasiswa> mahasiswa;

}
