public class method_overloading {
    //static void change(int [] arr){
     //arr[0]=58;
     //arr[1]=99;
    //}
    public static void main(String[] args) {
int b=4;
foo(b);
foo();
    }

  //int [] marks={52,77,98,88,96}; 
  //change(marks);
  //System.out.println(marks[0]); 
  //System.out.println(marks[1]); 
  static void foo(){
   System.out.println("good morning bro!");
  }
  static void foo(int a){
    System.out.println("good morning "+ a +" bro!");
  }
    
}
