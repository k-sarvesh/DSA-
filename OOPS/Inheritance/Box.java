package Inheritance;

public class Box {
    double width;
    double height;
    double length;

    public Box(){
        this.width = 0;
        this.height = 0;
        this.length = 0;
    }
    public Box(double length){
        this.length = length;
        this.width = 0;
        this.height = 0;
    }
    public Box(double width, double height){
        this.width = width;
        this.height = height;
        this.length = 0;
    }
    public Box(double width, double height, double length){
        this.width = width;
        this.height = height;
        this.length = length;
    }

}
