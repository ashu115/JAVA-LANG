class Circle {
    private double radius;
    static int numOfObject = -1;

    static {
        numOfObject = 0;
    }

    public Circle() {
        numOfObject++;
    }

    public Circle(double r) {
        this();
        this.setRadius(r);
    }

    public Circle(Circle obj) {
        this();
        this.setRadius(obj.radius);
    }

    public double getRadius() {
        return (this.radius);
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    public void getArea() {
        System.out.println("Radius : " + this.radius);
        System.out.println("Area   : " + Math.PI * (this.getRadius() * this.getRadius()));
    }

    public static void getNumOfObject() {
        System.out.println("Number of object created : " + numOfObject);
    }
}

class pr17 {
    public static void main(String args[]) {
        System.out.println("\n==================================\n");

        Circle first = new Circle();
        first.setRadius(1.5);
        first.getArea();

        System.out.println("\n==================================\n");
        Circle second = new Circle(first);
        second.setRadius(3.0);
        second.getArea();

        System.out.println("\n==================================\n");
        Circle second1 = new Circle(2.0);
        second1.getArea();

        System.out.println("\n==================================\n");
        Circle.getNumOfObject();
    }
}
