package com.mo;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class HelloController {

    @GetMapping("/")
    public String main() {
		return "main";
	}

}
