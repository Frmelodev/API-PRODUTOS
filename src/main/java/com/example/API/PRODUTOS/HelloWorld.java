package com.example.API.PRODUTOS;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/HelloWorld")
public class HelloWorld {
	
	
	
	
	
    @GetMapping("/hello")
	public String Hello() {
    	return  "Hello world";
    	
    }
 
}

