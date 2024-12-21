//import java.util.Scanner;
public class selection_sort {
    void sort(int[] arr){
        int min;
    for(int i=0;i<arr.length-1;i++){
     min=i;
     for(int j=i+1;j<arr.length;j++){
        if(arr[j]<arr[min]){
        min=j;
     }
    }
    int temp = arr[min];
    arr[min] = arr[i];
    arr[i] = temp;
    }
    for(int i=0;i<arr.length;i++){
        System.out.print("\t"+arr[i]);
    }
    }
    public static void main(String[] args) {
        int [] a={7,1,3,2,0,6};
        selection_sort s = new selection_sort();
        s.sort(a);
        
    }
}
