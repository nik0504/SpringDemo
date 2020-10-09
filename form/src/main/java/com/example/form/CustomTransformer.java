package com.example.form;

import org.springframework.messaging.Message;

public class CustomTransformer {
    public String transform(Message<String> message){
        return "hr";
    }
}
