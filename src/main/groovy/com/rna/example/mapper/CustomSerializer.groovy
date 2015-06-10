package com.rna.example.mapper

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider
import com.rna.example.entities.Thing

class CustomSerializer extends JsonSerializer<Thing> {

    @Override
    void serialize(Thing thing, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
        jgen.writeStartObject()

        jgen.writeStringField("id", thing.id.toString())
        jgen.writeStringField("name", thing.name.reverse())
        jgen.writeStringField("attribute", thing.attribute)
        jgen.writeStringField("number", thing.number.toString())
        // Add everything you want
        jgen.writeStringField("copyleft", "CopyLeft")

        jgen.writeEndObject()
    }
}
