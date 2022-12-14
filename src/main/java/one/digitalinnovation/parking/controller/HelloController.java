package one.digitalinnovation.parking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("/")
@ApiIgnore
public class HelloController {

    @GetMapping
    public String hello(){
        return "Hello!\nTo test this API with Swagger, please use the link https://cloud-api-parking.herokuapp.com/swagger-ui.html\nUser: user\nPassword: 123456";
    }

}
