package com.hkt;

public class Test {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {

        Girl g = new Girl();

        Animal an=Petstore.getAnimal("狗");
        g.play(an);
    }
}
