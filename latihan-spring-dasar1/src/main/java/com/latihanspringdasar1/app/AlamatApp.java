package com.latihanspringdasar1.app;

import com.latihanspringdasar1.util.Alamat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AlamatApp {

    @GetMapping("alamatsiswa1")
    public Alamat alamatSiswa1(){
        return new Alamat("Banjar",13,"Sukahurip","Pamarican","Ciamis","Jawa Barat","Indonesia",46382);
    }
    @GetMapping("/alamatsiswa2")
    public Alamat alamatSiswa2(){
        return new Alamat("Banjar",13,"Sukahurip","Pamarican","Ciamis","Jawa Barat","Indonesia",46382);
    }
    @GetMapping("/alamatguru")
    public Alamat alamatGuru(){
        return new Alamat("Banjar",30,"Sukajadi","Pamarican","Ciamis","Jawa Barat","Indonesia",46382);
    }
}
