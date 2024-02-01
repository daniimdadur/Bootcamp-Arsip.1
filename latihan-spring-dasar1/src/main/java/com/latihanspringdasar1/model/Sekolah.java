package com.latihanspringdasar1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sekolah {
    public String namaSekolah;
    public String namaKepSek;
    public Kelas kelas;
}
