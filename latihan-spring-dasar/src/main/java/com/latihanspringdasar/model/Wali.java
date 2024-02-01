package com.latihanspringdasar.model;

import com.latihanspringdasar.util.Alamat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Wali {
    public String namaWali;
    public Alamat alamatWali;
    public Integer noTlp;
    public String pekerjaan;
}
