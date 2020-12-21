import java.util.*;
public class Tester{
  public static void main(String[] args){

    int Error = 0;

    System.out.println("Sorted Array Testing");

    int[] a = new int [10000];
    int[] b = new int [10000];
    int[] c = new int [10000];
    int[] d = new int [10000];
    int count = 0;
    for (int i = 0; i < 10000; i++){
      a[i] = count;
      b[i] = count;
      c[i] = count;
      d[i] = count;
      count++;
    }

    Sorts.bubbleSort(a);
    Arrays.sort(b);
    if ((Arrays.toString(a)).equals(Arrays.toString(b))){
    }else{
      System.out.println("Error with Bubble Sort");
      Error++;
    }

    Sorts.selectionSort(c);
    if ((Arrays.toString(c)).equals(Arrays.toString(b))){
    }else{
      System.out.println("Error with Selection Sort");
      Error++;
    }

    Sorts.insertionSort(d);
    if ((Arrays.toString(d)).equals(Arrays.toString(b))){
    }else{
      System.out.println("Error with Insertion Sort");
      Error++;
    }

    System.out.println("--------------------");
    System.out.println("Reverse Array Testing");

    int[] e = new int [10000];
    int[] f = new int [10000];
    int[] g = new int [10000];
    int count1 = 9999;
    for (int i = 0; i < 10000; i++){
      e[i] = count1;
      f[i] = count1;
      g[i] = count1;
      count1--;
    }

    Sorts.bubbleSort(e);
    Arrays.sort(b);
    if ((Arrays.toString(e)).equals(Arrays.toString(b))){
    }else{
      System.out.println("Error with reverse array");
      Error++;
    }

    Sorts.selectionSort(f);
    if ((Arrays.toString(f)).equals(Arrays.toString(b))){
    }else{
      System.out.println("Error with Selection Sort");
      Error++;
    }

    Sorts.insertionSort(g);
    if ((Arrays.toString(g)).equals(Arrays.toString(b))){
    }else{
      System.out.println("Error with Insertion Sort");
      Error++;
    }

    System.out.println("--------------------");
    System.out.println("Same Element Testing");

    int[] h = new int [10000];
    int[] k = new int [10000];
    int[] l = new int [10000];
    int[] m = new int [10000];
    for (int i = 0; i < 10000; i++){
      h[i] = 0;
      k[i] = 0;
      l[i] = 0;
      m[i] = 0;
    }

    Arrays.sort(k);
    Sorts.bubbleSort(h);
    if ((Arrays.toString(h)).equals(Arrays.toString(k))){
    }else{
      System.out.println("Error with Bubble Sort");
      Error++;
    }

    Sorts.selectionSort(l);
    if ((Arrays.toString(l)).equals(Arrays.toString(k))){
    }else{
      System.out.println("Error with Selection Sort");
      Error++;
    }

    Sorts.insertionSort(m);
    if ((Arrays.toString(m)).equals(Arrays.toString(k))){
    }else{
      System.out.println("Error with Insertion Sort");
      Error++;
    }

    System.out.println("--------------------");
    System.out.println("Size Zero Arrays");

    int[] n = new int [0];
    int[] p = new int [0];
    int[] q = new int [0];
    int[] r = new int [0];

    Arrays.sort(n);
    Sorts.bubbleSort(p);
    if ((Arrays.toString(p)).equals(Arrays.toString(n))){
    }else{
      System.out.println("Error with Bubble Sort");
      Error++;
    }

    Sorts.selectionSort(q);
    if ((Arrays.toString(q)).equals(Arrays.toString(n))){
    }else{
      System.out.println("Error with Selection Sort");
      Error++;
    }

    Sorts.insertionSort(r);
    if ((Arrays.toString(r)).equals(Arrays.toString(n))){
    }else{
      System.out.println("Error with Insertion Sort");
      Error++;
    }

    System.out.println("--------------------");
    System.out.println("Random Array Testing");

    int[] test = new int[2000];
    int[] correct = new int[2000];

    int numBubbleError = 0;
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
          numBubbleError++;
          Error++;
      }
    }
    if (numBubbleError > 0){
      System.out.println("Error with Bubble Sort");
    }

    int numSelectionError = 0;
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
        numSelectionError++;
        Error++;
      }
    }
    if (numSelectionError > 0){
      System.out.println("Error with Selection Sort");
    }

    int numInsertionError = 0;
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
        numInsertionError++;
        Error++;
      }
    }
    if (numInsertionError > 0){
      System.out.println("Error with Insertion Sort");
    }

    System.out.println("--------------------");
    if (Error > 0){
      System.out.println("One or more errors");
    }else{
      System.out.println("All Good!");
    }

  }
}
