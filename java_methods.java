//methods in java ------> function in c
//if we cannot use static keyword for calling then we call the method 
// by class name and their object name line-29
public class java_methods {
    static int logic(int x,int y){
int z;
if(x>y){
    z=x+y;
}
else{
    z=(x+y)*3;
}
return z;
    }
    static int method(int p,int q){
int r;
if(p>q){
r=p+q;
}
else{
    r=(p+q)*2;
}
return r;

    }
    public static void main(String[] args) {
     int a=3;
     int b=7;
     int c;
     //java_methods obj=new java_methods();
     c= logic(a , b);
     System.out.println(c);  
     int l=1;
     int m=2;
     int n;
    // java_methods obj1=new java_methods();
     n=method(l , m);
     System.out.println(n); 
    }
}
