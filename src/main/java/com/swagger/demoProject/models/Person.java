package com.swagger.demoProject.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.webresources.StandardRoot;


@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Person {

    private int id;
    @NonNull
    private String name;
    @NonNull
    private String phone;

    private String address;

}
