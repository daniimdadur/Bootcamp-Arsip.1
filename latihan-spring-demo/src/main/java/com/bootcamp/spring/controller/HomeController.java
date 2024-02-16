package com.bootcamp.spring.controller;

import com.bootcamp.spring.model.request.Orang;
import com.bootcamp.spring.model.response.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class HomeController {
    @GetMapping("home")
    public ResponseEntity<Response> get() {
        Response<String> response = new Response<>();
        response.setData(null);
        response.setCode(0202);
        response.setMessage("Sukses");
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("orang")
    public ResponseEntity<Response> getOrang() {
        Response<Orang> response = new Response<>();
        Orang orang = new Orang();

        orang.setId(12345);
        orang.setName("Sabilla");
        orang.setAlamat("Surabaya");
        orang.setEmail("sabil12@gmail.com");
        orang.setJk("laki-laki");

        response.setData(orang);
        response.setCode(03);
        response.setMessage("Daftar orang paling rajin");

        return ResponseEntity.ok().body(response);
    }

    @GetMapping("orang2")
    public ResponseEntity<Response> getOrang2() {
        Response<List<Orang>> response = new Response<>();

        List<Orang> orang2 = List.of(
                new Orang(131203,"Imdadur","Pamarican","imddr@gmail.com","Laki-laki"),
                new Orang(123456,"Budi","Banjar","budi01@gmail.com","Laki-laki"),
                new Orang(654321,"Sabilla","Surabaya","sabil@gmail.com","Laki-laki")
        );
        response.setData(orang2);
        response.setCode(2024);
        response.setMessage("Daftar orang");

        return ResponseEntity.ok().body(response);
    }
}
