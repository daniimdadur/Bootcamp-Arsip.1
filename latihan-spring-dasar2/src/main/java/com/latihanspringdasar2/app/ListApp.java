package com.latihanspringdasar2.app;

import com.latihanspringdasar2.model.Dosen;
import com.latihanspringdasar2.model.Kelas;
import com.latihanspringdasar2.model.Mahasiswa;
import com.latihanspringdasar2.utils.Alamat;
import com.latihanspringdasar2.utils.MataPelajaran;
import com.latihanspringdasar2.utils.TempatTanggalLahir;
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
    @GetMapping("kelas")
    public ResponseEntity<Object> data(){
        List<Kelas> result = new ArrayList<>();

        Alamat alamatDosen = new Alamat("Banjar Sari",22,"Pamarican","Banjar Sari","Ciamis","West Java","U.S.A.","46382");
        Alamat alamatMahasiswa = new Alamat("Pamarican",21,"Sidaharja","Pamarican","Ciamis","West Java","Russia","46382");

        TempatTanggalLahir ttlDosen = new TempatTanggalLahir("Bekasi",22,"Desember",2005);
        TempatTanggalLahir ttlMahasiswa = new TempatTanggalLahir("Ciamis",21,"February",2005);

        Dosen dosen = new Dosen("Vida",ttlDosen,alamatDosen,"Perempuan","Islam","081234567890","vida22@gmail.com","221205","S.Kom");
        MataPelajaran matKul = new MataPelajaran(2122,"Teknik Industri","1202");

        List<Mahasiswa> mahasiswa = Arrays.asList(
                new Mahasiswa("Anah",ttlMahasiswa,alamatMahasiswa,"Laki-laki","Kristen","081234567890","anah21@gmail.com","Teknik Mesin","Tenik","12"),
                new Mahasiswa("Inah",ttlMahasiswa,alamatMahasiswa,"Perempuan","Kristen","081234567890","inah21@gmail.com","Teknik Mesin","Tenik","12")
        );
        Kelas kelas = new Kelas("2221",dosen,matKul,"Minggu",mahasiswa);
        result.add(kelas);
        return ResponseEntity.ok().body(result);
    }
}
