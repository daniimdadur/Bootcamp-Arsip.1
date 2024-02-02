package com.latihanspringdasar2.model;

import com.latihanspringdasar2.utils.Alamat;
import com.latihanspringdasar2.utils.Orang;
import com.latihanspringdasar2.utils.TempatTanggalLahir;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mahasiswa extends Orang {
    public String jurusan;
    public String fakultas;
    public String semester;

    public Mahasiswa(String name, TempatTanggalLahir ttl, Alamat alamat, String gender, String agama, String noTlp, String email, String jurusan, String fakultas, String semester) {
        super(name, ttl, alamat, gender, agama, noTlp, email);
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.semester = semester;
    }
}
