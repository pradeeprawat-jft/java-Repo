public class DataTypes {
    public static void main(String [] args) {
        int dec; // declaration
        dec = 14; // assignment
        int initialise = 46; // initialization

        // data types

        // 1. byte [range: -128 : 128 ] 8 bit
        byte byteVar = 125;
        // byteVar = 130  // throw error - value out of range

        // 2. boolean
        boolean areYouGirl = true; // default value is false

        // 3. short [have some range] 16 bit
        short shortVar = 32767 ;
        System.out.println(shortVar);

        // 4. integer -2^31 to 2^31 32 bit integer
        int intVar = 999999999;
        System.out.println(intVar);

        // 5. long -2^63 o 2^63 64 bit integer
        long longVar = 999999999999999999L;
        System.out.println(longVar);

        // 6. double - 64bit floating variable
        double doubleVar = -46.2001;
        System.out.println(doubleVar);

        // 7. float - 32 bit
        float floatVar = 2222.999999999999999999f;
        System.out.println(floatVar);

        // 8. char - 16-bit
        char word = 109;
        System.out.println(word);

    }
}
