package fish.payara.spring.boot.controller;

import fish.payara.spring.boot.domain.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/person")
public class PersonRestController {

    Map<Integer, Person> personMap = new HashMap<>();

    @PostConstruct
    public void init() {
        personMap.put(1, new Person(1, "Ruan", "Bekker", "ruan@gmail.com"));
        personMap.put(2, new Person(2, "Steve", "James", "steve@gmail.com"));
        personMap.put(3, new Person(3, "Frank", "Phillips", "frank@gmail.com"));
    }

    @RequestMapping("/all")
    public Collection<Person> getAll() {
        return personMap.values();
    }
}
