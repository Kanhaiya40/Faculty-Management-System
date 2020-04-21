package com.jason.documentation;

import org.jsondoc.spring.boot.starter.EnableJSONDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableJSONDoc
public class DocumentationApplication {

    public static void main(String[] args) {
        SpringApplication.run(DocumentationApplication.class, args);
    }

}
