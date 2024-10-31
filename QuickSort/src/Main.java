public class Main {
  public static void main(String[] args) {
    int[] arr = { 5, 3, 2, 4, 1, 8 ,7 ,9 ,6};

    quickSort(arr, 0, arr.length - 1);

    for(int i : arr) {
      System.out.println(i);
    }
  }

  public static void quickSort(int[] arr, int left, int right) {
    if(left < right) {
      int pi = partititon(arr, left, right);
      quickSort(arr, left, pi - 1);
      quickSort(arr, pi + 1, right);
    }
  }

  private static int partititon(int[] arr, int left, int right) {
    int pivot = arr[right];

    int i = left - 1;

    for(int j = left; j < right; j++) {
      if(arr[j] < pivot) {
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }

    int temp = arr[i + 1];
    arr[i + 1] = arr[right];
    arr[right] = temp;

    return i + 1;
  }
}