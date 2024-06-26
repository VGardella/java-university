public class TiposPrimitivosII {
    public static void main (String args[]) {
        // Por defecto:
        
        // Float:
        float numeroFloat = (float)3.4028235E38;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Minimo valor float = " + Float.MIN_VALUE);
        System.out.println("Maximo valor float = " + Float.MAX_VALUE);
        
        // Double:
        double numeroDouble = 1.7976931348623158E308;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Minimo valor double = " + Double.MIN_VALUE);
        System.out.println("Maximo valor double = " + Double.MAX_VALUE);
    }
}
