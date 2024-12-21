public class variable_argument {
   //static int sum(int a, int b){
    //return a+b;
   //}
   //static int sum(int a, int b,int c){
    //return a+b+c;
   //}
   static int sum(int x,int y,int ...arr){
    int result=0;
    for(int a:arr){
        result=x+a+y;
    }
    return result;
   }
       public static void main(String[] args) {
        System.out.println("the sum of no is"+  sum(3,23,4));
       // System.out.println("the sum of no is"+ sum(7,4,5)); 
    }
}
