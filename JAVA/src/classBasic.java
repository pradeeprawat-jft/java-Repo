
class Box {
    private int length; // instance variable
    private int breadth;
    private int height;
    public void setDimensions(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    public void getDimensions() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Height: " + height);
    }
}



public class classBasic {
    public static void main(String [] args) {
        // reference variable = which contain the value/address of other object
        // they're letting you the access of the object
        // they do not contain its own value
        // each variable pointing to object is reference variable
        Box referenceVarOfObj = new Box();
        referenceVarOfObj.getDimensions();
        referenceVarOfObj.setDimensions(12,12,12);
        referenceVarOfObj.getDimensions();

    }

}
