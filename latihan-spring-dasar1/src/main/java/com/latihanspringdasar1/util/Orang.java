package com.latihanspringdasar1.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orang {
    public Integer id;
    public String name;
    public TempatTl ttl;
    public Alamat alamat;
    public String gender;
    public String agama;
    public String noTlp;
    public String email;
    public String beratDanTinggiBadan; //opsional

    public Orang(Integer id, String name, TempatTl ttl, Alamat alamat, String gender, String agama, String noTlp, String email) {
        this.id = id;
        this.name = name;
        this.ttl = ttl;
        this.alamat = alamat;
        this.gender = gender;
        this.agama = agama;
        this.noTlp = noTlp;
        this.email = email;
    }

    public Orang(Integer id, String name, TempatTl ttl, String gender, String agama, String noTlp, String email, String beratDanTinggiBadan) {
        this.id = id;
        this.name = name;
        this.ttl = ttl;
        this.gender = gender;
        this.agama = agama;
        this.noTlp = noTlp;
        this.email = email;
        this.beratDanTinggiBadan = beratDanTinggiBadan;
    }

    public Orang(Integer id, String name, TempatTl ttl, String gender, String agama, String noTlp, String email) {
        this.id = id;
        this.name = name;
        this.ttl = ttl;
        this.gender = gender;
        this.agama = agama;
        this.noTlp = noTlp;
        this.email = email;
    }
}
