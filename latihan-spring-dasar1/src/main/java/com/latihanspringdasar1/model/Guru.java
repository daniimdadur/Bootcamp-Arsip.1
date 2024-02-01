package com.latihanspringdasar1.model;

import com.latihanspringdasar1.util.Alamat;
import com.latihanspringdasar1.util.Orang;
import com.latihanspringdasar1.util.TempatTl;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Guru extends Orang {
    public String title;
    public String nip;

    public Guru(Integer id, String name, TempatTl ttl, Alamat alamat, String gender, String agama, String noTlp, String email, String title, String nip) {
        super(id, name, ttl, alamat, gender, agama, noTlp, email);
        this.title = title;
        this.nip = nip;
    }
}
