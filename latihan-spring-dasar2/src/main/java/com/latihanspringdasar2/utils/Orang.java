package com.latihanspringdasar2.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orang {
    public String name;
    public TempatTanggalLahir ttl;
    public Alamat alamat;
    public String gender;
    public String agama;
    public String noTlp;
    public String email;
}
