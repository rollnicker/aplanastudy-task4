import java.util.Random;

public class Base {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random rand = new Random(System.currentTimeMillis());
        for (int x = 0; x < 20; x++) {
            int q = rand.nextInt(21) - 10;
            array[x] = q;
        }
        for (int y = 0; y < array.length; y++)
            System.out.println(array[y]);
        
        System.out.println();
        System.out.println("Самое большое число: " + getMax(array));
        System.out.println("Самое маленькое число: " + getMin(array));
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}