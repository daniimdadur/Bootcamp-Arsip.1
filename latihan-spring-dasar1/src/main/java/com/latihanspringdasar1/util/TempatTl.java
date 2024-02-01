package com.latihanspringdasar1.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TempatTl {
    public String kota;
    public Integer tanggal;
    public String bulan;
    public Integer tahun;
}
