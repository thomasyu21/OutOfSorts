public class Sorts{
  public static void bubbleSort(int[] data){
    int numLoop = data.length-1;
    int numLoop2 = data.length-1;
    int numSwap = 0;
    for (int i = 0; i < numLoop; numLoop--){
      numLoop2 = numLoop;
      for (int j = 0; j < numLoop2; j++){
        numSwap = 0;
        int temp1 = data[j];
        int temp2 = data[j+1];
        if (temp1 > temp2){
          data[j+1] = temp1;
          data[j] = temp2;
          numSwap++;
        }
        if (numSwap == 0){
          i = numLoop;
        }
      }
    }
  }
}
