package com.latihanspringdasar2.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alamat {
    public String jalan;
    public Integer no;
    public String Desa;
    public String Kec;
    public String kab;
    public String prov;
    public String country;
    public String kodePos;
}
