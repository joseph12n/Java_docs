package co.edu.sena.poo.tema04.primitivos;

public class App {
    public static void main(String[] args) {
        // tipos primitivos

        //tipos enteros
        System.out.println("********** tipos enteros **********");
        //tipo byte
        System.out.println("********** tipo byte **********");
        byte b = 127; // 1 byte
        System.out.println("valor: "+b);
        System.out.println("tamaño maximo: "+Byte.MAX_VALUE);
        System.out.println("tamamo minimo: "+Byte.MIN_VALUE);
        System.out.println("tamaño en bits: "+Byte.SIZE);
        System.out.println("tamaño en bytes: "+Byte.BYTES);

        //tipo short
        System.out.println("********** tipo short **********");
        short s = 32767; // 2 bytes
        System.out.println("valor: "+s);
        System.out.println("tamaño maximo: "+Short.MAX_VALUE);
        System.out.println("tamamo minimo: "+Short.MIN_VALUE);
        System.out.println("tamaño en bits: "+Short.SIZE);
        System.out.println("tamaño en bytes: "+Short.BYTES);

        //tipo int
        System.out.println("********** tipo int **********");
        int i = 2147483647; // 4 bytes
        System.out.println("valor: "+i);
        System.out.println("tamaño maximo: "+Integer.MAX_VALUE);
        System.out.println("tamamo minimo: "+Integer.MIN_VALUE);
        System.out.println("tamaño en bits: "+Integer.SIZE);
        System.out.println("tamaño en bytes: "+Integer.BYTES);

        //tipo long
        System.out.println("********** tipo long **********");
        long l = 9_223_372_036_854_775_807L; // 8 bytes es el literal de tipo long L
        System.out.println("valor: "+l);
        System.out.println("tamaño maximo: "+Long.MAX_VALUE);
        System.out.println("tamamo minimo: "+Long.MIN_VALUE);
        System.out.println("tamaño en bits: "+Long.SIZE);
        System.out.println("tamaño en bytes: "+Long.BYTES);

        //tipos reales
        System.out.println("********** tipos reales **********");
        //tipo float
        System.out.println("********** tipo float **********");
        float f = 3.4028235E38F; // 4 bytes es el literal de tipo float F
        System.out.println("valor: "+f);
        System.out.println("tamaño maximo: "+Float.MAX_VALUE);
        System.out.println("tamamo minimo: "+Float.MIN_VALUE);
        System.out.println("tamaño en bits: "+Float.SIZE);
        System.out.println("tamaño en bytes: "+Float.BYTES);

        //tipo double
        System.out.println("********** tipo double **********");
        double d = 1.7976931348623157E308; // 8 bytes
        System.out.println("valor: "+d);
        System.out.println("tamaño maximo: "+Double.MAX_VALUE);
        System.out.println("tamamo minimo: "+Double.MIN_VALUE);
        System.out.println("tamaño en bits: "+Double.SIZE);
        System.out.println("tamaño en bytes: "+Double.BYTES);

        //tipo char
        System.out.println("********** tipo char **********");
        char c = 'A'; // 2 bytes
        System.out.println("valor: "+c);
        System.out.println("tamaño maximo: "+(int)Character.MAX_VALUE);
        System.out.println("tamamo minimo: "+(int)Character.MIN_VALUE);
        System.out.println("tamaño en bits: "+Character.SIZE);
        System.out.println("tamaño en bytes: "+Character.BYTES);

        //tipo boolean
        System.out.println("********** tipo boolean **********");
        boolean bool = true; // 1 bit
        System.out.println("valor: "+bool);
        System.out.println("tamaño maximo: "+Boolean.TYPE);
        System.out.println("tamamo minimo: "+Boolean.TRUE);

        //tipo var
        System.out.println("********** tipo var **********");
        var var1 = "56"; // infiere el tipo de dato a String
        System.out.println("valor: "+var1);





    }
}
