public class Main {

  public static void main(String[] args) {
    //int res = fatorial(2);
    int res = fibonacci(2);
    System.out.println(res);
  }

  public static int fatorial(int n) {
    if (n <= 1) {
      return 1;
    }
    return n * fatorial(n - 1);
  }

  public static int fibonacci(int n) {
    if(n == 0) {
      return 0;
    }
    if(n == 1) {
      return 1;
    }
    return fibonacci(n-1) + fibonacci(n-2);
  }
}