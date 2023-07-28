package com.telstra.day4;

public class EncapsulationDemo {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Employee obj=new Employee();
        //obj.id=1;
        //obj.name="shubham";
        obj.setId(1);
        obj.setName("shubham");
        System.out.println(obj.getId());
        System.out.println(obj.getName());

    }
}
