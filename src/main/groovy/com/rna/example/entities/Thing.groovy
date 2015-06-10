package com.rna.example.entities

import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.rna.example.mapper.CustomSerializer

@JsonSerialize(using = CustomSerializer)
class Thing {

    Long id
    String name
    String attribute
    int number
}
