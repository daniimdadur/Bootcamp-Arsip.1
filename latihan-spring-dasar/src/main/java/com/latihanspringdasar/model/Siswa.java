package com.latihanspringdasar.model;

import com.latihanspringdasar.util.Alamat;
import com.latihanspringdasar.util.Orang;
import com.latihanspringdasar.util.TempatTL;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Siswa extends Orang {
    public Integer anakKe;
    public String kelas;
    public String asalSekolah;
    public String jurusan;
    public String citaCita;
    public String prestasi;
    public String hobi;

    //dengan hobi
    public Siswa(String name, TempatTL ttl, Alamat alamatLengkap, String gender, String agama, String noTlp, String email, String beratDanTinggiBadan, Integer anakKe, String kelas, String asalSekolah, String jurusan, String citaCita, String prestasi, String hobi) {
        super(name, ttl, alamatLengkap, gender, agama, noTlp, email, beratDanTinggiBadan);
        this.anakKe = anakKe;
        this.kelas = kelas;
        this.asalSekolah = asalSekolah;
        this.jurusan = jurusan;
        this.citaCita = citaCita;
        this.prestasi = prestasi;
        this.hobi = hobi;
    }

    public Siswa(String name, TempatTL ttl, Alamat alamatLengkap, String gender, String agama, String noTlp, String email, Integer anakKe, String kelas, String asalSekolah, String jurusan, String citaCita, String prestasi, String hobi) {
        super(name, ttl, alamatLengkap, gender, agama, noTlp, email);
        this.anakKe = anakKe;
        this.kelas = kelas;
        this.asalSekolah = asalSekolah;
        this.jurusan = jurusan;
        this.citaCita = citaCita;
        this.prestasi = prestasi;
        this.hobi = hobi;
    }
    //tanpa hobi
    public Siswa(String name, TempatTL ttl, Alamat alamatLengkap, String gender, String agama, String noTlp, String email, String beratDanTinggiBadan, Integer anakKe, String kelas, String asalSekolah, String jurusan, String citaCita, String prestasi) {
        super(name, ttl, alamatLengkap, gender, agama, noTlp, email, beratDanTinggiBadan);
        this.anakKe = anakKe;
        this.kelas = kelas;
        this.asalSekolah = asalSekolah;
        this.jurusan = jurusan;
        this.citaCita = citaCita;
        this.prestasi = prestasi;
    }

    public Siswa(String name, TempatTL ttl, Alamat alamatLengkap, String gender, String agama, String noTlp, String email, Integer anakKe, String kelas, String asalSekolah, String jurusan, String citaCita, String prestasi) {
        super(name, ttl, alamatLengkap, gender, agama, noTlp, email);
        this.anakKe = anakKe;
        this.kelas = kelas;
        this.asalSekolah = asalSekolah;
        this.jurusan = jurusan;
        this.citaCita = citaCita;
        this.prestasi = prestasi;
    }
}
