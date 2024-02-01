package com.latihanspringdasar.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orang {
    public String name;
    public TempatTL ttl;
    public Alamat alamatLengkap;
    public String gender;
    public String agama;
    public String noTlp;
    public String email;
    public String beratDanTinggiBadan; //opsional

    public Orang(String name, TempatTL ttl, Alamat alamatLengkap, String gender, String agama, String noTlp, String email) {
        this.name = name;
        this.ttl = ttl;
        this.alamatLengkap = alamatLengkap;
        this.gender = gender;
        this.agama = agama;
        this.noTlp = noTlp;
        this.email = email;
    }
}
