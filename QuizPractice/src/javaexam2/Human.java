package javaexam2;

public class Human {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Human() {
    }

    public Human(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String printInformation() {
        return  name + "  " + age + "  " + height + "   " + weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}
