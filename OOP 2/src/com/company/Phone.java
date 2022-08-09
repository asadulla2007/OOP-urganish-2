package com.company;

public class Phone<color, name, year> {
    String  name;
    String color;
    int  year;

    public Phone (){
    }
    public  Phone(String name, String color,int year){
        this.name = name;
        this.color = color;
        this. year = year;

    }
   public void show (){
       System.out.println("Phone name" +name);
       System.out.println("Phone color" +color);
       System.out.println("Phone year" +   year);
   }










}
