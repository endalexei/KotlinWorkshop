package exercises.day2.java;

public class Overloading {
    Point point1 = new Point();
    Point point2 = new Point();

    public void testThis(){
        point1.sum(point2);
    }

}


class Point {
    Integer a;
    Integer b;

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public Point sum(Point p) {
        Point result = new Point();
        result.setA(this.getA() + p.getA());
        result.setB(this.getB() + p.getB());
        return result;
    }

    public Point minus(Point p) {
        Point result = new Point();
        result.setA(this.getA() - p.getA());
        result.setB(this.getB() - p.getB());
        return result;
    }

    public Point times(Point p) {
        Point result = new Point();
        result.setA(this.getA() * p.getA());
        result.setB(this.getB() * p.getB());
        return result;
    }

    public Point div(Point p) {
        Point result = new Point();
        result.setA(this.getA() / p.getA());
        result.setB(this.getB() / p.getB());
        return result;
    }

    public Point inc() {
        Point result = new Point();
        result.setA(this.getA() + 1);
        result.setB(this.getB() + 1);
        return result;
    }

    public Point dec() {
        Point result = new Point();
        result.setA(this.getA() - 1);
        result.setB(this.getB() - 1);
        return result;
    }

}