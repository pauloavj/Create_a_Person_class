package test;


import test.Person.Person;

public class Main {
    public static void main(String[] args) {
        //create a new object
        Person jenny = new Person("Jenny",165, "female","London");

        //create a new object
        Person james = new Person("James", 195, "male", "London");

        //Print person's  introduction
        System.out.println(jenny.introducePerson());

        //Print second person's introduction or reply
        System.out.println(james.introducePerson(jenny.getPersonHometown()));

        // Print person's height
        System.out.println("My height is " + jenny.getHeightInches() + " inches");
    }
}
