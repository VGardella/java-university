public class TiposPrimitivos {
    public static void main(String args[]) {
        // Byte:
        System.out.println("Minimo valor byte: " + Byte.MIN_VALUE);
        System.out.println("Maximo valor byte: " + Byte.MAX_VALUE);
        
        byte conversionByte = (byte)129;
        System.out.println("conversionByte = " + conversionByte);
        
        // Short:
        System.out.println("Minimo valor short = " + Short.MIN_VALUE);
        System.out.println("Maximo valor short = " + Short.MAX_VALUE);
        
        short conversionShort = (short)32768;
        System.out.println("conversionShort = " + conversionShort);
        
        // Int
        System.out.println("Minimo valor int = " + Integer.MIN_VALUE);
        System.out.println("Maximo valor int = " + Integer.MAX_VALUE);
        
        int conversionInt = (int)2147483647; // No podemos usar un numero para romper la conversion porque manda error
        System.out.println("conversionInt = " + conversionInt);
        
        // Long
        System.out.println("Minimo valor long = " + Long.MIN_VALUE);
        System.out.println("Maximo valor long = " + Long.MAX_VALUE);
        
        int conversionLong = (int)2147483648L; // Al agregar la L indicaremos que es un numero de 64 bytes en lugar de 32 bytes
        System.out.println("conversionLong = " + conversionLong);
        
    }
}
