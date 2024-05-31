/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DUALHUB
 */
public class Monkey extends Animal {
    // Override makeSound method to print "Chatter"
    @Override
    public void makeSound() {
        System.out.println("Chatter");
    }

    // Override eat method to print "Eating bananas"
    @Override
    public void eat() {
        System.out.println("Eating bananas");
    }
}
