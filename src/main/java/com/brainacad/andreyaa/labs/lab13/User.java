package com.brainacad.andreyaa.labs.lab13;

import java.util.Objects;

class User {

    private String name;
    private Integer age; // old
    private String phone;

    public User(String name, Integer age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User {" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", phone = '" + phone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(age, user.age) &&
                Objects.equals(phone, user.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, phone);
    }

}
