package exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contacts {
    private static List<Person> contacts =  new ArrayList<>();

    public static void addPerson(){
        Scanner scanner= new Scanner(System.in);
        Person person =  new Person();
        try {
            System.out.println("Please type the name of the person");
            String name = scanner.nextLine();
            person.setName(name);

            System.out.println("Please type the age of the person");
            int age = scanner.nextInt();
            person.setAge(age);

            contacts.add(person);
            System.out.println("Person added succesfully");
        } catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
            System.out.println("Starting the process of adding a person again");
            addPerson();
        } finally {
            scanner.close();
        }
    }

    public static void main(String[] args) {
        addPerson();
    }
}

