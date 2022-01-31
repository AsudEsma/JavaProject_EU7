package assignments.Assignment_OOP_Concepts.Q04;

import java.util.Scanner;

public class Q4 {
    /**
     * Person class has following attributes:
     *
     * - private String instance variables: firstName, lastName
     * - private int instance variable: age
     *
     * Methods:
     * - getter and setter methods for each instance variable. try to use this. keyword
     * - toString method.No parameters and Returns(does not print! no println in the method!)
     * person info in this format: "firstName | lastName | age"
     *
     * Constructors:
     *
     * 1) No-Args constructor
     * -sets default values for the Person object
     * name and lastName => "undefined"
     * age => -1
     *
     * 2) 3-Args Constructor:
     * - accepts firstName, lastName, age parameters and assigns values to encapsulated instance variable
     * try to use this. keyword
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Person person1 = new Person();
        System.out.println(person1.getFirstName());
        System.out.println(person1.getAge());
        person1.setAge(in.nextInt());
        System.out.println(person1.getAge());

        Person person = new Person(in.next(), in.next(), in.nextInt());
        System.out.println(person.getLastName());
        System.out.println(person.toString());
    }
}
