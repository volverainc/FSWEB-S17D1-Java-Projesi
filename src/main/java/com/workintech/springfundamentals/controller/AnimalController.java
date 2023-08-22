package com.workintech.springfundamentals.controller;

import com.workintech.springfundamentals.model.Animal;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/workintech/animal")
public class AnimalController {
    private Map<Integer, Animal> animals;
    @Value("${instructor.name}")
    private String name;
    @Value("${instructor.surname}")
    private String surname;

    @GetMapping("/welcome")
    public String welcome(){
        return name + "-" + surname;
    }

    public AnimalController() {
       animals = new HashMap<>();
    }

    @GetMapping("/")
    public List<Animal> getAllAnimals() {
        return animals.values().stream().toList();
    }

    @GetMapping("/{id}")
    public Animal get(@PathVariable int id){
        if(id<0) {

        }
        if(!animals.containsKey(id)){

        }

        return animals.get(id);
    }

    @PostMapping("/")
    public Animal save(@RequestBody Animal animal){
    if(animals.containsKey(animal.getId())){

    }
    if(animal.getId() < 0 || animal.getName() == null || animal.getName().isEmpty()){

    }

    animals.put(animal.getId(), animal);
    return animals.get(animal.getId());
    }

    @PutMapping("/{id}")
    public Animal update(@PathVariable int id, @RequestBody Animal animal){
      if(!animals.containsKey(id)){

      }
        if(animal.getId() < 0 || animal.getName() == null || animal.getName().isEmpty()){

        }

        animals.put(id, new Animal(id,animal.getName()));
        return animals.get(id);
    }

    @DeleteMapping("/{id}")
    public Animal delete(@PathVariable int id){
        if(!animals.containsKey(id)){

        }
        Animal foundAnimal = animals.get(id);
        animals.remove(id);
        return foundAnimal;
    }
    }


