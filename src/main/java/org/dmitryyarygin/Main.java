package org.dmitryyarygin;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.makeSound(); // Выводит: Some sound
        myDog.makeSound(); // Выводит: Bark
        myCat.makeSound(); // Выводит: Meow
    }
}