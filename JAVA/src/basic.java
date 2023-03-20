public class basic {
    public static void main(String [] args) {
        int integer = 30;
        double dblVar = (double) integer;
        String dataType = ( (Object)dblVar ).getClass().getTypeName();
        System.out.println(dataType);

        integer = (int) dblVar;
        dataType = ((Object)integer).getClass().getName();
        System.out.println(dataType);

        double newDbl = 99.8987;
        dataType = ((Object)newDbl).getClass().getName();
        System.out.println(dataType);
        integer = (int) newDbl;
        dataType = ((Object)integer).getClass().getName();
        System.out.println(dataType);
        System.out.println(integer);
    }
}
