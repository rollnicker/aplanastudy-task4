import java.util.Random;

public class task_4_1 {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random rand = new Random(System.currentTimeMillis());
        for (int x = 0; x < 20; x++) {
            int q = rand.nextInt(21) - 10;
            array[x] = q;
        }
        for (int y = 0; y < array.length; y++)
            System.out.print(array[y]+" ");

        System.out.println();
        System.out.println("Самое большое число: " + getMax(array));
        System.out.println("Самое маленькое число: " + getMin(array));

        for (int y = 0; y < array.length; y++) {
            if (array[y] == getMax(array)) {
                for (int x = 0; x < array.length; x++){
                    if (array[x] == getMin(array)){
                        int tmp2 = array[y];
                        int tmp = array[x];
                        array[y] = tmp;
                        array[x] = tmp2;
                    }
                }
            }
        }
        for (int y = 0; y < array.length; y++)
            System.out.print(array[y]+" ");
    }
    public static int getMax(int[] arr) {
        int max = -10;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0 ){
            if (arr[i] > max) {
                max = arr[i];
            }}
        }
        return max;
    }
    public static int getMin(int[] arr) {
        int min = 10;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min && arr[i] >= 1) {
                min = arr[i];
            }
        }
        return min;
    }
}