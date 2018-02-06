package com.socialcoding.learn.hellospringboot;
 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class HelloRestController {
 
  @RequestMapping("/add/{name}")
  public String addEntry(@PathVariable String name) {
	  System.out.println("your name s is:"+name);
    return "Hello. All your base are belong to us."+name;
  }
  


}