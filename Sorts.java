public class Sorts{
  public static void bubbleSort(int[] data){
    int numSwap = 0;
    for (int i = 0; i < data.length-1; i++){
      numSwap = 0;
      for (int j = 0; j < data.length-1-i; j++){
        if (data[j] > data[j+1]){
          int temp = data[j];
          data[j] = data[j+1];
          data[j+1] = temp;
          numSwap++;
        }
      }
      if (numSwap == 0){
        i = data.length;
      }
    }
  }

  public static void selectionSort(int[] data){
    for (int i = 0; i < data.length-1; i++){
      int temp = data[i];
      int index = i;
      for (int j = i; j < data.length; j++){
        if (data[j] < temp){
          temp = data[j];
          index = j;
        }
      }
      data[index] = data[i];
      data[i] = temp;
    }
  }

  public static void insertionSort(int[] data){
    for (int i = 0; i < data.length; i++){
      int temp = data[i];
      int index = i;
      int j = i-1;
      while (j >= 0 && temp < data[j]){
        data[j+1] = data[j];
        index--;
        j--;
      }
      data[index] = temp;
    }
  }
}
