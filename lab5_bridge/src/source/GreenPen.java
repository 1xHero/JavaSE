package source;

public class GreenPen implements DrawingAPI{

    @Override
    public void drawCircle(int radius, int x, int y){
        System.out.println("Drawing circle [ color: green, radius: " + radius + "]");
    }

    @Override
    public void drawSquare(int x, int y, int side){
        System.out.println("Drawing square [ color: green, side: " + side + "]");
    }
}
