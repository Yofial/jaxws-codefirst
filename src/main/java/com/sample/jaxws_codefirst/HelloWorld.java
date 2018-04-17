
package com.sample.jaxws_codefirst;

import javax.jws.WebService;

@WebService
public class HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}