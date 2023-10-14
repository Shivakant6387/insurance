package com.example.icici.lombard.controller;


import com.example.icici.lombard.entity.Book;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping(value = "/getBook", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<Book> getBook() {
        Book book = new Book();
        book.setTitle("Example Book");
        book.setAuthor("John Doe");
        book.setYear(2023);
        return ResponseEntity.ok(book);
    }
    @PostMapping(value = "/mapXMLtoJson", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<String> mapXmlToJson(@RequestBody String inputXml) {
        try {
            String json = processXmlToJsonObject(inputXml);
            return ResponseEntity.ok("Processed JSON: " + json);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error converting XML to JSON: " + e.getMessage());
        }
    }

    private String processXmlToJsonObject(String inputXml) throws Exception {
        XmlMapper xmlMapper = new XmlMapper();

        JsonNode jsonNode = xmlMapper.readTree(inputXml);

        ObjectMapper jsonMapper = new ObjectMapper();

        String json = jsonMapper.writeValueAsString(jsonNode);

        return json;
    }
}