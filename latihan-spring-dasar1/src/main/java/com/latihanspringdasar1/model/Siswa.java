package com.latihanspringdasar1.model;

import com.latihanspringdasar1.util.Alamat;
import com.latihanspringdasar1.util.Orang;
import com.latihanspringdasar1.util.TempatTl;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Siswa extends Orang {
    public String umur;
    public String jurusan;
    public String pringkat;

    public Siswa(Integer id, String name, TempatTl ttl, Alamat alamat, String gender, String agama, String noTlp, String email, String beratDanTinggiBadan, String umur, String jurusan, String pringkat) {
        super(id, name, ttl, alamat, gender, agama, noTlp, email, beratDanTinggiBadan);
        this.umur = umur;
        this.jurusan = jurusan;
        this.pringkat = pringkat;
    }

    public Siswa(Integer id, String name, TempatTl ttl, Alamat alamat, String gender, String agama, String noTlp, String email, String umur, String jurusan, String pringkat) {
        super(id, name, ttl, alamat, gender, agama, noTlp, email);
        this.umur = umur;
        this.jurusan = jurusan;
        this.pringkat = pringkat;
    }

    public Siswa(Integer id, String name, TempatTl ttl, String gender, String agama, String noTlp, String email, String beratDanTinggiBadan, String umur, String jurusan, String pringkat) {
        super(id, name, ttl, gender, agama, noTlp, email, beratDanTinggiBadan);
        this.umur = umur;
        this.jurusan = jurusan;
        this.pringkat = pringkat;
    }

    public Siswa(Integer id, String name, TempatTl ttl, String gender, String agama, String noTlp, String email, String umur, String jurusan, String pringkat) {
        super(id, name, ttl, gender, agama, noTlp, email);
        this.umur = umur;
        this.jurusan = jurusan;
        this.pringkat = pringkat;
    }
}
