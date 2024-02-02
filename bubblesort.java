public class bubblesort {
  public static void main(String[] arg) {
    int min = 0;
    int[] numbers = {
      3,
      7,
      1,
      5
    };
    for (int j = 0; j < numbers.length; j++) {
      for (int i = 1; i < numbers.length; i++) {
        if (numbers[i - 1] > numbers[i]) {
          min = numbers[i];
          numbers[i] = numbers[i - 1];
          numbers[i - 1] = min;
        }
      }
    }
    for (int k: numbers) {
      System.out.println(k);
    }
  }
}
