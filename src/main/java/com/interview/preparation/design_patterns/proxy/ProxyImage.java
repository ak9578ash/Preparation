package com.interview.preparation.design_patterns.proxy;

public class ProxyImage {
    private RealImage realImage;
    private String imageName;

    public ProxyImage(String imageName){
        this.imageName = imageName;

    }

    public void Display(){
        if (realImage == null){
            realImage = new RealImage(this.imageName);
        }
        realImage.Display();
    }
}
