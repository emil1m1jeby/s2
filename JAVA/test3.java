class A {
    
    void obj() {
        System.out.println("My First Java Program.");
    }
    
    }
class B extends A {
        
        void obj() {
        System.out.println("My First Java.");
        }
    }


public class test3 {
    public static void main(String[] args) {
       // A n = new A();
       int ch=1;
       while(ch>3){
       System.out.println("My First Java Program.");
       ch=ch+1;
       }       
       
        B n1 = new B();
        System.out.println("My First Java Program.");
        //n.obj(); 
        n1.obj();// Corrected method call
    }
}
