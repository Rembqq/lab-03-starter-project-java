package com.example.controllers;

import com.example.models.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class MainController {
    @GetMapping("/people")
    public String printPeople(Model model) {
        List<Person> friends = new ArrayList<Person>();
        int friendsNumber = 15;
        Random random = new Random();
        int id = 1;
        String[] names = {"Jeremy", "Nick", "Amanda", "Lucille", "Sanyok", "Ann", "Roman", "Ashley", "William",
                          "Daniel", "Kathleen", "Scott", "Nicole", "Mark", "Samuel", "Adam", "Lisa", "Jason"};
        for(int i = 0; i < friendsNumber; ++i) {
            friends.add(new Person(String.format("%07d", id++), names[random.nextInt(names.length)],
                    random.nextInt(80) + 1, Float.parseFloat(String.format("%.2f", random.nextFloat(60) + 50))));
        }
        System.out.println(friends);
        model.addAttribute("people", friends);
        return "printPeople.html";
    }
}
