package rikkie.academy;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Test getRadius --->"+circle.getRadius());
        System.out.println("Test getColor() ==> "+circle.getColor());
        //Thay đổi các access modifier: private, protected, public bên class: Circle và test lại kết quả
    }
}
