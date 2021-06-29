package com.codegym;

public class Human {
    private String name;
    private String age;
    private String gender;
    private String phone;

    public Human (){

    }

    public Human(String name, String age, String gender, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name +
                ", age='" + age +
                ", gender='" + gender +
                ", phone='" + phone +
                '}';
    }
    public String write() {
        return name + ", " + age + ", " + gender + ", " + phone;
    }
}
