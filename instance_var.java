import java.util.Scanner;
public class instance_var {
    int a;
    int b;
    int sum;
    public static void main(String[] args) {
       instance_var obj=new instance_var();
       Scanner scan=new Scanner(System.in);
       System.out.print("ENTER FIRST NUMBER: ");
       obj.a=scan.nextInt();
       System.out.print("ENTER SECOND NUMBER:");
       obj.b=scan.nextInt();
       obj.sum= obj.a + obj.b;
       System.out.println("ANSWER="+obj.sum);
    }  
}
