package school.hei.primaryNumber.endpoint.rest.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import school.hei.primaryNumber.service.HelloWorldService;

@RestController
@AllArgsConstructor
public class HelloWorldController {
    private final HelloWorldService service;

    @GetMapping("/hello")
    public String helloWorld(@RequestParam String name) {
        return service.uploadHelloWorldMessage(name);
    }
}
