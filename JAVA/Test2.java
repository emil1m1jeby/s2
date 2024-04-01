class Outer {
    int ol;
    
    void ott_obj() {
        System.out.println("My First Java Program.");
    }
    
    
class Inner {
        int il;
        
        void ii_obj() {
        System.out.println("My First Java Program.");
        }
    }
}

public class Test2 {
    public static void main(String[] args) {
        Outer n = new Outer();
        Outer.Inner n1 = n.new Inner();
        System.out.println("My First Java Program.");
        n.ott_obj(); 
        n1.ii_obj();// Corrected method call
    }
}
