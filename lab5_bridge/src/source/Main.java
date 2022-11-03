package source;

public class Main {

    public static void main(String[] args){
        Shape redCircle = new Circle(12, 12, 4, new RedPen());
        Shape redSquare = new Square(12, 12, 4, new RedPen());

        redCircle.draw();
        redSquare.draw();

        Shape greenCircle = new Circle(6, 6, 3, new GreenPen());
        Shape greenSquare = new Square(6, 6, 3, new GreenPen());

        greenSquare.draw();
        greenCircle.draw();
    }
}
