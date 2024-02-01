package com.latihanspringdasar1.app;

import com.latihanspringdasar1.util.TempatTl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TempatTlApp {
    @GetMapping("ttlguru")
    public TempatTl ttlGuru(){
        return new TempatTl("Bekasi",22,"Desember",2005);
    }
    @GetMapping("/ttlsiswa1")
    public TempatTl ttlSiswa1(){
        return new TempatTl("Ciamis",21,"Februari",2005);
    }
    @GetMapping("/ttlsiswa2")
    public TempatTl ttlSiswa2() {
        return new TempatTl("Ciamis", 21, "Februari", 2005);
    }
}
