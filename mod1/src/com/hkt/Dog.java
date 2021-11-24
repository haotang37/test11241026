package com.hkt;

public class Dog extends Animal{
    //喊叫：
    public void shout(){ //对父类重写
        System.out.println("我是小狗，我可以汪汪叫");
    }
    public void guard(){
        System.out.println("我是小狗，我可以看家护院，保护我的小主人。。。");
    }
}
