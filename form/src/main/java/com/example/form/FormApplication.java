package com.example.form;

import com.example.form.database.PersonGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@SpringBootApplication
@Configuration
@ImportResource("integration-context.xml")
public class FormApplication implements ApplicationRunner {

    private PersonGateway gateway;
    EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
    EmbeddedDatabase db = builder.setType(EmbeddedDatabaseType.H2).addScript("init.sql").build();
    public static void main(String[] args) {
        SpringApplication.run(FormApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
