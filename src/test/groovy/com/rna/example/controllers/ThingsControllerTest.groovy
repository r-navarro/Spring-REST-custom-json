package com.rna.example.controllers

import groovy.json.JsonSlurper
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import spock.lang.Specification


class ThingsControllerTest extends Specification {

    MockMvc mockMvc

    def setup(){
        mockMvc = MockMvcBuilders.standaloneSetup(new ThingsController()).build()
    }

    def "My json is custom made by custom serializer"(){
        when:
        def response = mockMvc.perform(MockMvcRequestBuilders.get("/things/23")).andReturn().response
        println response.contentAsString
        def content = new JsonSlurper().parseText(response.contentAsString)

        then:
        content.copyleft == "CopyLeft"
        content.name == "name23".reverse()
    }
}
