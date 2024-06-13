/*
2. Create a package com.animals. 

Create a base class Animal with: 

A method sound() that prints "Animal sound". 

Create a subclass Dog in the same package that overrides the sound() method to print "Bark". 

Create another subclass Cat that overrides the sound() method to print "Meow". 

In a package com.test, create a main class that creates an array of Animal and stores instances of Dog and Cat. 

Use a loop to call the sound() method on each animal in the array. 

 */

 package com.test;

 import com.animals.Animal;
 import com.animals.Dog;
 import com.animals.Cat;
 
 public class Main {
     public static void main(String[] args) {
         Animal[] animals = {new Dog(), new Cat()};
 
         for (Animal animal : animals) {
             animal.sound();
         }
     }
 }
