package com.example.democamelapp;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("file:///dataexchange/in")
                .log("file has been moved")
                .to("file:///dataexchange/out");
    }
}
