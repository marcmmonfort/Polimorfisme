public class Triangle extends Figura{
    double b, h;

    public Triangle(double b, double h){
        this.b = b;
        this.h = h;
    }

    public double area(){
        return (b*h)/2;
    }
}
