public class Suma{

    // Atributs de la classe ...
    int numFigures;
    Figura[] vec;

    // Constructor de la classe ...
    public Suma(Figura[] vector)
    {
            this.vec = vector;
            this.numFigures = vector.length;
    }

    // Mètode de la classe ...
    public double suma(){
        double areaTotal = 0;
        int i = 0;
        while (i < numFigures){
            areaTotal = areaTotal + vec[i].area();
            i = i + 1;
        }
        return areaTotal;
    }
}
