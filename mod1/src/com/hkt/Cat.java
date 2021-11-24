package com.hkt;

public class Cat extends Animal{
    //喊叫方法：
    public void shout(){ //对父类重写
        System.out.println("我是小猫，可以喵喵叫");
    }
    public void scratch(){
        System.out.println("我是小猫，我可以挠人");
    }
}
