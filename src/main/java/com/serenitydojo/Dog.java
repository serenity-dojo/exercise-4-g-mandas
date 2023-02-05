package com.serenitydojo;

public class Dog {
    private static final String DOG_NOISE = "Woof";
    private String favoriteToy;
    private String name;
    private int age;
    private String dogSound;

    public Dog(String name, String favoriteToy, int age) {
        this.name = name;
        this.favoriteToy = favoriteToy;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public int getAge() {
        return age;
    }

    public void feed() {
        isFed();
    }

    public String makeNoise() {
        return DOG_NOISE;
    }

    public boolean isFed() {
        return true;
    }
}
