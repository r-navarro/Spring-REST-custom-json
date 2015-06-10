package com.rna.example.controllers

import com.rna.example.entities.OtherThing
import com.rna.example.entities.Thing
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/things")
class ThingsController {

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    Thing getThingById(@PathVariable("id") Long id){
        return new Thing(id:id, name: "name${id}", attribute: "attribute", number: 42)
    }

    // not really the REST philosophy
    @RequestMapping(value="/other/{id}", method = RequestMethod.GET)
    OtherThing getOtherThingById(@PathVariable("id") Long id){
        return new OtherThing(id:id, name: "name${id}", attribute: "attribute", number: 42)
    }
}
