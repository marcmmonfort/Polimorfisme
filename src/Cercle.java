public class Cercle extends Figura{
    double r;

    public Cercle(double r){
        this.r = r;
    }

    public double area(){
        return (Math.PI)*(Math.pow(r,2));
    }
}
