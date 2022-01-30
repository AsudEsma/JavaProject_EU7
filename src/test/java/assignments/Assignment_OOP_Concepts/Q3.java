package assignments.Assignment_OOP_Concepts;

import java.util.Scanner;

public class Q3 {
    /**
     * In Db class we have two attributes/instance variables with the private visibility.
     * meaning they cannot be accessed outside of the class.
     *** Instance variables:
     * 1) name: data -
     * type: String
     * Visibility/Access modifier: private
     * 2) name: yint -
     * type: int
     * Visibility/Access modifier: private
     *** Methods:
     * - insertData - lets you set the values to above encapsulated instance variables.
     * - getData - getter method for private data
     * - getYint - getter method for private yint
     * - setData - setter method for private data
     * - setYint - setter method for private yint
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Db db = new Db(in.next(),in.nextInt());

        System.out.println(db.getData());
        System.out.println(db.getYint());

        db.setData(in.next());
        db.setYint(in.nextInt());

        System.out.println(db.getData());
        System.out.println(db.getYint());
    }
}
