package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    double height;
    String gender;
    String nationality;


    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public Person(double height, String gender, String nationality, String firstName){
        this(firstName);
        this.height = height;
        this.gender = gender;
        this.nationality = nationality;

    }

    public  String getFirstName(){
        return firstName;
    }

    public  String getLastName(){
        return lastName;
    }

    public  int getAge(){
        return age;
    }

    public boolean isTeen(){
        return age >= 13 && age < 19;
    }
}




