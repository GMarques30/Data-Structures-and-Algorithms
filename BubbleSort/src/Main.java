public class Main {
  public static void main(String[] args) {
    int[] arr = {5, 2, 3, 1, 4};

    bubbleSort(arr);

    for(int i : arr) {
      System.out.println(i);
    }

  }

  public static void bubbleSort(int[] arr) {
    int length = arr.length;
    for(int i : arr) {
      boolean isSorted = true;
      for(int j = 0; j < length - 1; j++) {
        if(arr[j] > arr[j + 1]) {
          isSorted = false;
          int temp = arr[j + 1];
          arr[j + 1] = arr[j];
          arr[j] = temp;
        }
      }
      if(isSorted) return;
    }
  }
}