package org.example;

public class Wall {
    double width;
    double height;

    public Wall(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return  width;
    }

    public double getHeight(){
        return  height;
    }

    public void setWidth(double newWidth){
        if(newWidth < 0){
            this.width = 0;
        }else{
            this.width = newWidth;
        }
    }

    public void setHeight(double newHeight){
        if(newHeight < 0){
            this.height = 0;
        }else{
            this.height = newHeight;
        }
    }

    public double getArea(){
        return width * height;
    }
}
