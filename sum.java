interface A{
    void a();
    void b();
    void c();
    void d();
}

abstract class B implements A{
   public void a(){
        System.out.println("I am function a");
    }
}
class C extends B{
    public void b(){
        System.out.println("I am function b");
    }
    public void c(){
        System.out.println("I am function c");
    }
    public void d(){
        System.out.println("I am function d");
    }
}

class sum{
    public static void main(String[] args){
        A obj = new C();
        obj.a();
        obj.b();
        obj.c();
        obj.d();

	// adding new line 
    }
}
