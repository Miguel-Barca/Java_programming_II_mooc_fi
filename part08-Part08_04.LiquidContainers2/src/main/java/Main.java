/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel
 */
public class Main {
    public static void main(String[] args) {
        Person joan = new Person("Joan Ball");
        System.out.println(joan);

        Person ball = joan;
        ball.growOlder();
        ball.growOlder();

        System.out.println(joan);

        joan = new Person("Joan B.");
        System.out.println(joan);
        System.out.println(ball);
        System.out.println("test");
        
        Bird red = new Bird("Red");
System.out.println(red);

Bird chuck = new Bird("Red");
System.out.println(chuck);

if (red.equals(chuck)) {
    System.out.println(red + " equals " + chuck);
}
    }
}
