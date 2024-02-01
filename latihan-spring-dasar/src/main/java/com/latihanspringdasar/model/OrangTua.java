package com.latihanspringdasar.model;

import com.latihanspringdasar.util.Alamat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrangTua {
    public String namaAyah;
    public String namaIbu;
    public Alamat alamatOrtu;
    public String noTlpOrtu;
    public String pekerjaanAyah;
    public String pekerjaanIbu;
}
