import java.util.*;
public class Main {
  static Scanner console = new Scanner(System.in);
  public static void main(String[] args) {
     int[] array = new int[10];
     int i;
     System.out.print("Enter 10 numbers: ");
     for(i=0; i<array.length; i++){
       array[i] = console.nextInt();
     }
     int temp1 = array[0];
     int temp2 = array[0];
     for(i=0; i<array.length; i++){
       if(array[i] < temp1){
         temp1 = array[i];
       }
       if(array[i] > temp2){
         temp2 = array[i];
       }
     }
     System.out.println(temp2 - temp1);
  }
}