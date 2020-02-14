package br.com.cinq.sample.controller;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

import br.com.cinq.sample.bean.Person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class PersonController {

    @GetMapping("/rest/people")
    List<Person> all() {
        return generateFakeList();
    }

    private List<Person> generateFakeList() {
        Random rnd = new Random();
        String[] name = { "Adam", "Abe", "Maria", "Rose", "Mario", "Luigi"};
        String[] surname = { "Lincoln", "Franklin", "Jackson", "Miyazaki", "M'bebe"};
        List<Person> list = new ArrayList<Person>();
        
        for(int i=0; i<10; i++) {
            Person person = new Person();
            person.setId(i);
            person.setName(name[rnd.nextInt(name.length)] + " " + surname[rnd.nextInt(surname.length)]);
            person.setDisclosableInfo("Lorem ipsum dolor sit amet, consectetur adipiscing elit," + 
            "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad mini" +
            "m veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo c"+
            "onsequat.");
            
            list.add(person);
        }
        
        return list;
    }
}
