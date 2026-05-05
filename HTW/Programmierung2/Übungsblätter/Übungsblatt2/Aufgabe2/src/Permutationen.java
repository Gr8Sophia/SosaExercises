import java.util.Arrays;

public class Permutationen {
int counter = 0;

    public void permutation(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Bitte Array befuellen");
        }

        int[] result = new int[arr.length];
        boolean[] used = new boolean[arr.length];

        fillPosition(arr, result, used, 0);
    }

    private void fillPosition(int[] arr, int[] result, boolean[] used, int position) {
        if (position == arr.length) {
            counter++;
            System.out.println(counter + ". " + Arrays.toString(result));
            return;
        }

        tryIndex(arr, result, used, position, 0);
    }

    private void tryIndex(int[] arr, int[] result, boolean[] used, int position, int index) {
        if (index == arr.length) {
            return;
        }

        if (!used[index]) {
            result[position] = arr[index];
            used[index] = true;

            fillPosition(arr, result, used, position + 1);

            used[index] = false;
        }

        tryIndex(arr, result, used, position, index + 1);
    }


    public void permutationWithThree() {
        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j != i) {
                    for (int k = 0; k < arr.length; k++) {
                        if (k != i && k != j) {
                            System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        }
                    }
                }

            }
        }
    }
}
