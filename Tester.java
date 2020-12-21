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

    int[] test = new int[2000];
    int[] correct = new int[2000];


    int numError = 0;
    for (int i = 0; i < 1000; i++){
      Random rng = new Random();
      for(int j =  0; j < 2000; j++){
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
          numError++;
      }
    }

    for (int i = 0; i < 1000; i++){
      Random rng1 = new Random();
      for(int j =  0; j < 2000; j++){
        int temp1 = (rng1.nextInt() % 1000);
        test[j] = temp1;
        correct[j] = temp1;
      }
      Sorts.selectionSort(test);
      Arrays.sort(correct);
      if ((Arrays.toString(test)).equals(Arrays.toString(correct))){
      }else{
          System.out.println("ERROR");
          System.out.println("Selection Sort: " + Arrays.toString(test));
          System.out.println("Correct: " + Arrays.toString(correct));
          numError++;
      }
    }


    for (int i = 0; i < 10; i++){
      Random rng2 = new Random();
      for(int j =  0; j < 5; j++){
        int temp1 = (rng2.nextInt() % 100);
        test[j] = temp1;
        correct[j] = temp1;
      }
      Sorts.insertionSort(test);
      Arrays.sort(correct);
      if ((Arrays.toString(test)).equals(Arrays.toString(correct))){
      }else{
          System.out.println("ERROR");
          System.out.println("Insertion Sort: " + Arrays.toString(test));
          System.out.println("Correct: " + Arrays.toString(correct));
          numError++;
      }
    }

    if (numError == 0){
      System.out.println("All Good!");
    }
  }
}
