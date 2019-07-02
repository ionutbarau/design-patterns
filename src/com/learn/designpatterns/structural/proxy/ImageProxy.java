package com.learn.designpatterns.structural.proxy;

/**
 * The Proxy class that forwards requests to the RealSubject and handles it's creation.
 *
 */
public class ImageProxy implements Graphic{

    /**
     * The RealSubject reference
     */
    private Image image;

    @Override
    public void draw() {
        if(image == null){
            System.out.println("Creating the real image");
            image = new Image();
        }
        //forward the request to the real subject once it is created.
        image.draw();
    }

    @Override
    public int getSize() {
        if(image == null){
            return 0;
        }else{
            return image.getSize();
        }

    }
}
