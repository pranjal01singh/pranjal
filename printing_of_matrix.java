public class printing_of_matrix {
public static void main(String[] args) {
    int [] [] a1=new int[2][3];
    int i,j;
    a1 [0][0]=100;
    a1 [0][1]=100;
    a1 [0][2]=10;
    a1 [1][0]=100;
    a1 [1][1]=130;
    a1 [1][2]=100;
    for(i=0;i<a1.length;i++){
        for(j=0;j<a1[1].length;j++){
System.out.print(a1[i][j]);
System.out.print(" ");
        }
        System.out.print("\n");   
    }

  } 
}
