package com.learn.designpatterns.structural.proxy;

public class Client {

    public static void main(String[] args){
        Graphic image  = new ImageProxy();
        System.out.println("Size before creation");
        System.out.println(image.getSize());

        //get the real subject to draw itself by creating it first
        image.draw();

        System.out.println("Size after creation");
        System.out.println(image.getSize());

    }
}
