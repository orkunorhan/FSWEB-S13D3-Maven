package org.example;

public class Wall {
    private double width;
    private double height;

    public Wall(double width, double height){
        this.width=width;
        this.height=height;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double widthValue){
        if(widthValue<0){
            this.width=0;
        } else {
             this.width=widthValue;
        }
    }

    public void setHeight(double heightValue){
        if(heightValue<0){
            this.height=0;
        } else {
            this.height=heightValue;
        }
    }

    public double getArea(){
        return width*height;
    }
}
