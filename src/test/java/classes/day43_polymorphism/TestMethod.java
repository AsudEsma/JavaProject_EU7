package classes.day43_polymorphism;

public class TestMethod {
    public static void main(String[] args) {

        ChildA chA = new ChildA();
        chA.m1();
        chA.m2();
        chA.m3();

        ChildB chB = new ChildB();
        chB.m1();
        chB.m2();
        chB.m4();

        Parent pr1 = new ChildA();      // Polymorphism only have access to Overriden methods.
        pr1.m1();
//      pr1.m2();
//      pr1.m3();

        Parent pr2 = new ChildB();      // Polymorphism only have access to Overriden methods.
        pr1.m1();
//      pr1.m2();
//      pr1.m4();
    }
}

class Parent {
    public void m1() {}
}

interface IMyInterface {
    void m2();
}

class ChildA extends Parent implements IMyInterface {
    public void m2() {}
    public void m3() {}
}

class ChildB extends Parent implements IMyInterface {
    public void m2() {}
    public void m4() {}
}
