package Inheritance;

public class Main {
    public static void main(String[] args) {
        BoxWeight boxWeight = new BoxWeight(10, 20, 30, 40);
        System.out.println("Width: " + boxWeight.width);
        System.out.println("Height: " + boxWeight.height);
        System.out.println("Length: " + boxWeight.length);
        System.out.println("Weight: " + boxWeight.weight);
    }
}
