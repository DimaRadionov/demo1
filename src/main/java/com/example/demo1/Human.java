package com.example.demo1;

public class Human {

    public String name;
    public Integer age;
    public String eyeColor;
    public Integer height;
    static int fingers;


    public Human(String name, Integer age, String eyeColor, Integer height) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        this.height = height;
    }

    public Human(String name, Integer age, String eyeColor) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
    }

    public Human(String eyeColor, Integer height) {
        this.eyeColor = eyeColor;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", eyeColor='" + eyeColor + '\'' +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {

        Human human1 = new Human("Vlad", 12, "blue", 189);
        Human human2 = new Human("Artem", 32, "brown", 190);
        Human human3 = new Human("Oleg", 21, "green", 145);
        Human human4 = new Human("Lena", 45, "grey", 179);
        Human human5 = new Human("Maks", 31, "brown", 156);

        System.out.println(human1.toString());
        System.out.println(human2.toString());
        System.out.println(human3.toString());
        System.out.println(human4.toString());
        System.out.println(human5.toString());
    }

}