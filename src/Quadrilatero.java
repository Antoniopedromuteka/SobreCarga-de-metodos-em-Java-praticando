

public class Quadrilatero {

    public static void area(double lado){
        System.out.println("a are do quadrado é:"+lado*lado);
    }
    public static void area(double lado1,double lado2){
        System.out.println("a are do retangulo é:"+lado1*lado2);
    }
    public static void area(double baseMaior,double baseMenor, double altura){
        System.out.println("a are do quadrado é:"+((baseMaior+baseMenor)*altura)/2);
    }
}
