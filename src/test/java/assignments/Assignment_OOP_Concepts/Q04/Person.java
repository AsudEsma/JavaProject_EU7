package assignments.Assignment_OOP_Concepts.Q04;

public class Person {
    private String firstName, lastName;
    private int age;

    public Person() {
        firstName = "undefined";
        lastName = "undefined";
        age = -1;
    }

    public Person(String firstName, String lastName, int age) {
        setAge(age);
        setFirstName(firstName);
        setLastName(lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(!firstName.isEmpty()) {
            this.firstName = firstName;
        } else {
            this.firstName = "undifined";
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0 || age>99) {
            this.age = -1;
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return firstName + " | " + lastName + " | " + age;
    }
}
