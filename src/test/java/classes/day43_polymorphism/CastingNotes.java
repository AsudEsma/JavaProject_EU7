package classes.day43_polymorphism;

public class CastingNotes {

    public static void main(String[] args) {

        A obj = new B();
        obj.methodA();
        B obj2 = (B) obj;   //B obj2 = new B();
        obj2.methodA();
        obj2.methodB();

        A obj1 = new C();
        //cast to B and call methodB
        obj2 = (B) obj;
        obj2.methodA();
        obj2.methodB();
        //method C???

        C obj3 = (C) obj;
        obj3.methodA();
        obj3.methodB();
        obj3.methodC();

/*        ++++++++++++++++++++++++++++++++++
                A obj = new B();
        C obj2 = (C) obj;  //not possible
        A
                B
        C
       You can not cast below your object level
        ++++++++++++++++++++++++++++++++++
                A
        B
                C
        D
        A obj2 = new D();
        Casting options: B, C, D
        A obj2 = new C();
        Casting options: B, C

        */

        Animals an = new Goat();
        an.speak();
        Goat gt = (Goat) an;
        gt.eat("grass");
        ((Goat) an).eat("grass");
    }
}

    //    Casting
    class A {
        public void methodA() {
        }
    }

    class B extends A {
        public void methodB() {
        }
    }

    class C extends B {
        public void methodC(){}
    }

    class Animals {
        public void speak(){}
    }
    class Goat extends Animals {
        public void eat(String str){}
    }


