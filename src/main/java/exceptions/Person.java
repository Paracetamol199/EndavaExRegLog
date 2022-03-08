package exceptions;

public class Person {
    private String name;
    private int age;

    public void setName(String name) {
        if (name == null || name.trim().equals("")) {
            throw new IllegalArgumentException("Name should not be empty");
        }
        if (!name.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException(
                    "Name should only contain characters: " + name);
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException(
                    "Age should be a positive number: " + age);
        }
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
