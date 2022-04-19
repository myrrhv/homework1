import com.sun.jdi.CharValue;

public class Main {

    public static void main(String[] args) {
        byte a;
        short b;
        int c;
        long d;
        char e;
        float f;
        double g;
        boolean h;

        int intmaxValue = Integer.MAX_VALUE;
        int intminValue = Integer.MIN_VALUE;
        System.out.println("Максимально-допустиме значення типу int:" + intmaxValue + " " +
                "Мінімально-допустиме значення типу int:" + intminValue);

        int bytemaxValue = Byte.MAX_VALUE;
        int byteminValue = Byte.MIN_VALUE;
        System.out.println("Максимально-допустиме значення типу byte:" + bytemaxValue + " " +
                "Мінімально-допустиме значення типу byte:" + byteminValue);

        int shortmaxValue = Short.MAX_VALUE;
        int shortminValue = Short.MIN_VALUE;
        System.out.println("Максимально-допустиме значення типу short :" + shortmaxValue + " " +
                "Мінімально-допустиме значення типу short :" + shortminValue);

        long longmaxValue = Long.MAX_VALUE;
        long longminValue = Long.MIN_VALUE;
        System.out.println("Максимально-допустиме значення типу long :" + longmaxValue + " " +
                "Мінімально-допустиме значення типу long:" + longminValue);

        double doublemaxValue = Double.MAX_VALUE;
        double doubleminValue = Double.MIN_VALUE;
        System.out.println("Максимально-допустиме значення типу double :" + doublemaxValue + " " +
                "Мінімально-допустиме значення типу double:" + doubleminValue);

        float floatmaxValue = Float.MAX_VALUE;
        float floatminValue = Float.MIN_VALUE;
        System.out.println("Максимально-допустиме значення типу float :" + floatmaxValue + " " +
                "Мінімально-допустиме значення типу float :" + floatminValue);

        int [] array = {9,2,39,56,4,1,9,43,7};

        int max = array[0];
        int min = array[0];
        for (int j : array) {
            if (j > max) {
                max = j;
            } else if (j < min) {
                min = j;
            }
        }

        System.out.println("Min=" + min + " ," + "Max=" + max);




    }



}
