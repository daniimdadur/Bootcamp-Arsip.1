package com.latihanspringdasar2.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TempatTanggalLahir {
    public String tempat;
    public Integer tanggal;
    public String bulan;
    public Integer tahun;
}
