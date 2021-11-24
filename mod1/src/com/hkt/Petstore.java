package com.hkt;

public class Petstore {
    public static Animal getAnimal(String petName){
        Animal an=null;
        if("猫".equals(petName)){
            an=new Cat();
        }
        if("狗".equals(petName)){
            an=new Dog();
        }
        if("猪".equals(petName)){
            an=new Pig();
        }
        return an;
    }
}
