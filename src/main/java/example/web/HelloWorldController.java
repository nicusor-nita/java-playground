package example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class HelloWorldController {

    @Autowired
    private UserService service;

    @GetMapping("/ro")
    public String sayHelloRo(@RequestParam Long id) {
        User u= service.getUser(id);
        return "Salutare "+u.getFirstName();
    }

    @GetMapping(value = "/en/{id}")
    public String sayHelloEn(@PathVariable Long id) {
        User u= service.getUser(id);
        return "Hello "+u.getFirstName();
    }

    @PostMapping(value = "/it")
    public String sayHelloIt(@RequestBody Long id) {
        User u= service.getUser(id);
        return "Hello "+u.getFirstName();
    }

    @PostMapping(value = "/fr")
    public User sayHelloFr(@RequestBody Credentials credentials) {
        System.out.println(credentials.getUsername());
        System.out.println(credentials.getPassword());
        User u= service.getUserByEmail("picimanul@gmail.com");
        return u;
    }


}
