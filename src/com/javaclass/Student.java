package com.javaclass;

public class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        age = 0;
        if (age>0 || age<=100) {
            this.age = age;
        }else{
            System.out.println("请输入正确的年龄!");
        }

    }

    public int getAge() {
        return age;
    }
    public void show(){
        System.out.println(name +","+age);
    }

}
