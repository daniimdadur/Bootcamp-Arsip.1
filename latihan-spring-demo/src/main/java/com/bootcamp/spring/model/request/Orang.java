package com.bootcamp.spring.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orang {
    private Integer id;
    private String name;
    private String alamat;
    private String email;
    private String jk;


}
