package laba5;

/* Describes person and its information */

public class Person {
    //fields
    private String name;
    private String surname;
    private int age;

    //constructors
    public Person() {
    }
    public Person(String name, String  surname, int age) {
        this.name=name;
        this.surname=surname;
        this.age=age;
    }

    //getters
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }



    //public methods

    //prints info about the person
    public void printInfo() {
        System.out.printf("Person %s %s, age: %d.%n", surname, name, age);
    }
}
