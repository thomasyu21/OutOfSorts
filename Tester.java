import java.util.*;
public class Tester{
  public static void main(String[] args){
    int[] a = {10,9,8,7,6,5,4,3,2,1};
    int[] b = {10,9,8,7,6,5,4,3,2,1};
    Sorts.bubbleSort(a);
    Arrays.sort(b);
    if ((Arrays.toString(a)).equals(Arrays.toString(b))){
    }else{
      System.out.println("Failed to sort backwards array");
      System.out.println("Bubble Sort: " + Arrays.toString(a));
      System.out.println("Correct: " + Arrays.toString(b));
    }

    int[] c = new int[0];
    Sorts.bubbleSort(c);
    System.out.println(Arrays.toString(c));

    int[] d = {1,2,3,4,5,6,7,8,9,10};
    Sorts.bubbleSort(d);
    System.out.println(Arrays.toString(d));

    int[] test = new int[20];
    int[] correct = new int[20];

    for (int i = 0; i < 10000; i++){
      Random rng = new Random();
      for(int j =  0; j < 20; j++){
        int temp = (rng.nextInt() % 1000);
        test[j] = temp;
        correct[j] = temp;
      }
      Sorts.bubbleSort(test);
      Arrays.sort(correct);
      if ((Arrays.toString(test)).equals(Arrays.toString(correct))){
      }else{
          System.out.println("ERROR");
          System.out.println("Bubble Sort: " + Arrays.toString(test));
          System.out.println("Correct: " + Arrays.toString(correct));
      }
    }
    System.out.println("All Good");
  }
}
