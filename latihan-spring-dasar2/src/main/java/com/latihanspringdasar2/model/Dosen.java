package com.latihanspringdasar2.model;

import com.latihanspringdasar2.utils.Alamat;
import com.latihanspringdasar2.utils.Orang;
import com.latihanspringdasar2.utils.TempatTanggalLahir;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dosen extends Orang {
    public String nip;
    public String title;

    public Dosen(String name, TempatTanggalLahir ttl, Alamat alamat, String gender, String agama, String noTlp, String email, String nip, String title) {
        super(name, ttl, alamat, gender, agama, noTlp, email);
        this.nip = nip;
        this.title = title;
    }
}
