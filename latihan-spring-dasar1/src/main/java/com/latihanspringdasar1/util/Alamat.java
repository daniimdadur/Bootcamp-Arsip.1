package com.latihanspringdasar1.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alamat {
    public String jalan;
    public Integer nomor;
    public String desa;
    public String kec;
    public String kab;
    public String prov;
    public String country;
    public Integer kodePos;

}
