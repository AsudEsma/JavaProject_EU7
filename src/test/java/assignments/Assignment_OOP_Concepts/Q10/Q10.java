package assignments.Assignment_OOP_Concepts.Q10;

public class Q10 {
    /**
     * A static method can be used without instantiating a class object.
     * Like in the calculator class create a plus and minus.
     * But this time make them static methods.
     * plus: gets two ints and returns the addition of the two numbers as an int
     * minus: the same as plus its also static, but it returns the substructed value of the two ints it gets
     *
     * calc.minus(1,1)
     * returns:0
     *
     * calc.plus(10,1)
     * returns:11
     */
    public static void main(String[] args) {
        System.out.println(Calc.plus(10, 1));
        System.out.println(Calc.minus(1, 1));
        System.out.println(Calc.plus(10, 5));
        System.out.println(Calc.minus(20, 6));
    }
}
