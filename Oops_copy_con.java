class Car{
    String color;
    String modal;
    Car( Car obj)
    {
        this.color = obj.color;
        this.modal = obj.modal;
        System.out.println("color is "+this.color+" modal is "+modal);
    }

    Car(){}
}
public class Oops_copy_con {
public static void main(String[] args){
    Car obj1 = new Car();
    obj1.color = "black";
    obj1.modal = "supra";
    Car obj4 = new Car();
    obj4.color = "black";
    obj4.modal = "thar";
    Car obj2 = new Car(obj1);
    Car obj3 = new Car(obj4);
}
}
