package com.latihanspringdasar1.app;

import com.latihanspringdasar1.model.Guru;
import com.latihanspringdasar1.model.Kelas;
import com.latihanspringdasar1.model.Sekolah;
import com.latihanspringdasar1.model.Siswa;
import com.latihanspringdasar1.util.Alamat;
import com.latihanspringdasar1.util.MataPelajaran;
import com.latihanspringdasar1.util.TempatTl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
public class ListApp {
    @GetMapping("sekolah")
    public ResponseEntity<Object>data(){
        List<Sekolah> result = new ArrayList<>();

        //data guru
        MataPelajaran mataPelajaran = new MataPelajaran(13,"Java OOP","3");
        Alamat alamatGuru = new Alamat("Banjar",30,"Sukajadi","Pamarican","Ciamis","Jawa Barat","Indonesia",46382);
        TempatTl ttlGuru = new TempatTl("Bekasi",22,"Desember",2005);
        Guru guru = new Guru(22,"Vida", ttlGuru, alamatGuru, "Perempuan","Islam","081211032123","vida22@gmail.com","S.Li.","1234");

        //data siswa
//        Alamat alamatSiswa1 = new Alamat("Banjar",13,"Sukahurip","Pamarican","Ciamis","Jawa Barat","Indonesia",46382);
//        Alamat alamatSiswa2 = new Alamat("Banjar",13,"Sukahurip","Pamarican","Ciamis","Jawa Barat","Indonesia",46382);
        TempatTl ttlSiswa1 = new TempatTl("Ciamis",21,"Februari",2005);
        TempatTl ttlSiswa2 = new TempatTl("Ciamis",21,"Februari",2005);
        List<Siswa> siswa = Arrays.asList(
                new Siswa(123,"Ebew",ttlSiswa1,"Wanita","Kristen","089123456789","ebew21@gmail.com","70","Pertanian","Peringkat 120"),
                new Siswa(123,"Bambang",ttlSiswa2,"Laki-laki","Majusi","089123456789","ketek21@gmail.com","120/150","70","Pertanian","Peringkat 120")
        );
        Kelas kelas = new Kelas("XII MIPA 1",guru,mataPelajaran,"Ahad","20 jam",siswa);
        Sekolah sekolah = new Sekolah("SMK AL HIDAYAH","Cimin",kelas);

        result.add(sekolah);
        return ResponseEntity.ok().body(result);
    }

}
