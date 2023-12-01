public class Main {
    public static void main(String[] args) {

        try {
            division(5.0,0.0);
        } catch (ArithmeticException e) {
            System.out.println("Errore: " + e.getMessage());
        }

        try {
            division(null,10.0);
        } catch (ArithmeticException e) {
            System.out.println("Errore: " + e.getMessage());
        }

        try {
            division(10.0,2.0);
        } catch (ArithmeticException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
    public static void division(Double numerator, Double denominator) {
        if (numerator == null || denominator == null) {
            throw new ArithmeticException("Numeratore o denominatore = null");
        } else if (denominator == 0) {
            throw new ArithmeticException("Impossibile dividere per 0");
        } else {
            System.out.println(numerator / denominator);
        }
    }
}
