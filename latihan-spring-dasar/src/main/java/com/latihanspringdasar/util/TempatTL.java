package com.latihanspringdasar.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TempatTL {
    public String kota;
    public String tanggal;
    public String bulan;
    public String tahun;
}
