package module4;
abstract class Circle{
    abstract void display();
}

class Shape extends Circle {
    void display() {
        System.out.println("This is a Circle");
    }

    public static void main(String[] args) {
        Shape s = new Shape();
        s.display();
    }
}