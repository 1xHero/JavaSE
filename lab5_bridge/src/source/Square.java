package source;

public class Square extends Shape{
    private int x, y, side;

    public Square(int x, int y, int side, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.side = side;
    }

    public void draw() {drawingAPI.drawSquare(x, y, side);}
}
