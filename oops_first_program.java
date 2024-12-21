class Employee{
    int id;
    String name;
    float salary;
    public void alldetails(){
    System.out.println("my id is: "+ id);
    System.out.println("my name is: "+name);
    System.out.println("my salary is: "+salary);
    System.out.println();
    }   
}
public class oops_first_program {
    
    public static void main(String[] args) {
  Employee pranjal=new Employee();
  Employee vardan=new Employee();
        pranjal.id=23043;
        pranjal.name="Pranjal singh";
        vardan.id=23044;
        vardan.name="vardan sharma";
        pranjal.salary=80000;
        vardan.salary=80000;
       // System.out.println(pranjal.id);
        //System.out.println(pranjal.name);
        pranjal.alldetails();
        vardan.alldetails();
    }
}
