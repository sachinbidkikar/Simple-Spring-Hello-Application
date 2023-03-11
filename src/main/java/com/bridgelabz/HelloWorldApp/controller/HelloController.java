package com.bridgelabz.HelloWorldApp.controller;

import com.bridgelabz.HelloWorldApp.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    // http://localhost:9090/hello/    * Genral Annotion method *
    @GetMapping(value = {"/", ""})
    public String sayHello() {
        return "Hello This Is SpringBoot's @GetMapping";
    }

    // http://localhost:9090/hello/query?name=Sachin * Query Parameter Method *
    @GetMapping("/query")
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name;
    }

    //http://localhost:9090/hello/path/sachin
    @GetMapping("/path/{name}")
    public String sayHellopath(@PathVariable String name) {
        return "Hello" + name + " From Springboot";
    }

//http://localhost:9090/hello/post   *we have to add json file & use post method*
    @PostMapping("post")
    public String sayHello(@RequestBody User user) {
        return "hello" + " " + user.getFirstName() + " " + user.getLastName() + " " + "From Bridgelabz";
    }
}

/* Json for Api Testing
{
        "firstName" : "sachin",
        "lastName" : "sachin"

 }*/
