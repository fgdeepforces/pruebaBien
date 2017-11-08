package com.fernando.endpoint;

import javax.xml.ws.Endpoint;
import com.fernando.ws.HelloWorldImpl;

public class HelloWorldPublisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
    }

}
