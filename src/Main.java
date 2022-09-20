public class Main {
    public static void main(String[] args) {

        System.out.println("Polimorfisme 1 - Marc Moran Monfort");

        Figura[] vecFigures = new Figura[4]; // Vector amb 4 Figures.

        // Afegim 4 figures diferents al vector de figures ...
        vecFigures[0] = new Rectangle(5,2); // Costat 1 i Costat 2.
        vecFigures[1] = new Quadrat(5); // Costat.
        vecFigures[2] = new Triangle(3,4); // Base i Altura.
        vecFigures[3] = new Cercle(2); // Radi.

        // Sumem les àrees de totes les figures que tenim al vector de figures i ho escrivim a consola ...
        Suma Areas = new Suma(vecFigures);
        double areaTotal = Areas.suma();
        System.out.println("Suma de les Àrees:" + areaTotal);

        // Escrivim les àrees a consola ...
        System.out.println(vecFigures[0].area());
        System.out.println(vecFigures[1].area());
        System.out.println(vecFigures[2].area());
        System.out.println(vecFigures[3].area());
    }
}