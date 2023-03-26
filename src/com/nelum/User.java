package com.nelum;

public class User {
    private String name;
    private String membership;
    private int age;

    public User(String name, int age, String membership) {
        this.name = name;
        this.age = age;
        this.membership = membership;
    }

    public User(String name, String membership) {
        this.name = name;
        this.membership = membership;
    }

    void setName( String name){
        this.name = name;
    }
    String getName(){
        return name;
    }

    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return age;
    }

    void setMembership(String membership){
        this.membership = membership;
    }
    String getMembership(){
        return membership;
    }

}
