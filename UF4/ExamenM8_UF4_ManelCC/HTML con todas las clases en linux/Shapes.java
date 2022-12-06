
package shapes;


public class Shapes {
/**
 * @autor ManelCC
 * @return double
 */
    public double getArea() {
        return 0;
    }
}

/**
 * @return double
 */
class Rectangle extends Shapes {

    //Camps de la classe
    private double width;
    private double height;


    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public double getArea() {
        return width * height;
    }
}

/**
 * @return double
 */
class Circle extends Shapes {

    //Camps de la classe
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }


    public double getArea() {
        return 3.14 * radius * radius;
    }

}



