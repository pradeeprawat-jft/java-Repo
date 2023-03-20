class Bike {
    void category() {
        System.out.println("bike");
    }
}

class bmw extends Bike {
    void category() {
        System.out.println("Sports");
    }
}

class Honda extends Bike {
    void category() {
        System.out.println("daily Use");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Bike obj = new Bike();
        bmw obj1 = new bmw();
        Honda obj2 = new Honda();
        obj.category();
        obj1.category();
        obj2.category();
    }
}


