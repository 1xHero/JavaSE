package source;
public class RedPen implements DrawingAPI{

    @Override
    public void drawCircle(int radius, int x, int y){
        System.out.println("Drawing circle [ color: red, radius: " + radius + "]");
    }

    @Override
    public void drawSquare(int x, int y, int side){
        System.out.println("Drawing square [ color: red, side: " + side + "]");
    }
}
