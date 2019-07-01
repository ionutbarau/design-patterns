package com.learn.designpatterns.structural.decorator;

public class Client {

    public static void main(String[] args){
        VisualComponent component = new ScrollDecorator(new BorderDecorator(new TextView(),45),"up");
        component.draw();
    }
}
