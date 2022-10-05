package source;

public class Main {

    public static void main(String[] args) {

        ShapeCache.loadCache();

        Shape Shape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape: " + Shape.getType() + " :: hashcode " + Shape.hashCode());

        Shape Shape2 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape: " + Shape2.getType() + " :: hashcode: " + Shape2.hashCode());

        Shape Shape3 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape: " + Shape3.getType() + " :: hashcode: " + Shape3.hashCode());

    }
}
