interface Sunstar {
  public void printInfo();
  public void print1Info();
}

class Employee implements Sunstar {
    public void printInfo() {
        String name = "Avinash"; // Corrected capitalization
        int age = 21;
        float salary = 222.2F;
 
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
    public void print1Info() {
        String name = "Avinash"; // Corrected capitalization
        int age = 21;
        System.out.println(name);
        System.out.println(age);
}
}
class lis extends Employee{
 

}

class Test5 {
    public static void main(String args[]) {
        lis s = new lis(); // Corrected capitalization
        s.printInfo();
         s.print1Info();
    }
}
