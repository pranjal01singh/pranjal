//recursion--> A function which calls itself
import java.util.Scanner;
public class recursion {
    static int factorial(int n){
if(n==1 || n==0){
return 1;
}
else{
    return (n*factorial(n-1));
}
}

public static void main(String[] args) {  
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number to find factorial: ");
    int a=sc.nextInt();
    int b=factorial(a);
    System.out.print("the factorial of no is: "+b);
}
}
