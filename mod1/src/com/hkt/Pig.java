package com.hkt;

public class Pig extends Animal{
        int weight;
    public void shout(){ //对父类重写
        System.out.println("我是小猪，我嗯嗯嗯的叫");
    }
    public void eat(){
        System.out.println("我是小猪，我爱吃东西。。");
    }
}