package Inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){
        this.weight = 0;
    }

    public BoxWeight(double length , double width , double height , double weight){
        super(length , width , height);
        this.weight = weight;
    }
}