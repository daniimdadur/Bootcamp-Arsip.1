package com.latihanspringdasar.app;

import com.latihanspringdasar.model.OrangTua;
import com.latihanspringdasar.model.Sekolah;
import com.latihanspringdasar.model.Siswa;
import com.latihanspringdasar.util.Alamat;
import com.latihanspringdasar.util.TempatTL;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/siswa")
public class ListApp {
    @GetMapping

    public ResponseEntity<Object> data() {
        List<Sekolah> result = new ArrayList<>();

        Alamat alamatSiswa = new Alamat("Jl.Pamarican", 13, "Sukahurip", "Pamarican", "Ciamis", "Jawa Barat", "Indonesia", 46382);
        Alamat alamatOrtu = new Alamat("Jl.Pamarican", 13, "Sukahurip", "Pamarican", "Ciamis", "Jawa Barat", "Indonesia", 46382);

        TempatTL ttlSiswa = new TempatTL("Ciamis", "25", "Juni", "2008");

        OrangTua orangTua = new OrangTua("Fulan", "Fulanah", alamatOrtu, "083456712123", "Wiraswasta", "IRT");
        Siswa siswa = new Siswa("Haikal", ttlSiswa, alamatSiswa, "Laki-laki", "Kristen", "085723516259", "haikal@gmail.com", 10, "XII MIPA", "MA IPHI Pamarican", "TKR", "Gammers", "Juara 1 tour ML tingkat nasional");

        Sekolah sekolah = new Sekolah("SDN 2 SUKAHURIP", siswa, orangTua);
        result.add(sekolah);

        return ResponseEntity.ok().body(result);
    }
}
