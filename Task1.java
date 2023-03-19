import java.util.LinkedList;

public class Task1 {

    private static void reverse(LinkedList<Integer> arr) {
        System.out.println();
        int temp = 0;
        int j = arr.size() - 1;
        for (int i = 0; i < arr.size() / 2; i++) {
            int current = arr.get(i);
            int mirror = arr.get(j);
            temp = current;
            arr.set(i, mirror);
            arr.set(j, temp);
            j--;
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList<>();

        for (int i = 1; i <= 11; i++) {
            arr.add(i);
        }
        System.out.println("Созданный список: " + arr);
        reverse(arr);
        System.out.println("Перевернутый список: " + arr);

    }
}