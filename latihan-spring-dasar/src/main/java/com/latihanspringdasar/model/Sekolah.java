package com.latihanspringdasar.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sekolah {
    public String namaSekolah;
    public Siswa bioSiswa;
    public OrangTua bioOrtu;
    public Wali bioWali;

    public Sekolah(String namaSekolah, Siswa bioSiswa, OrangTua bioOrtu) {
        this.namaSekolah = namaSekolah;
        this.bioSiswa = bioSiswa;
        this.bioOrtu = bioOrtu;
    }
}
