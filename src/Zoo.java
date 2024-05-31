/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DUALHUB
 */
public class Zoo {
    public static void main(String[] args) {

        Animal[] animals = new Animal[3];
        animals[0] = new Lion();
        animals[1] = new Elephant();
        animals[2] = new Monkey();


        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName() + ":");
            animal.makeSound();         
            animal.eat();            
            System.out.println();       
        }
    }
}
