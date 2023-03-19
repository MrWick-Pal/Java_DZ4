import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Task2 {

    private static void first(Queue<Integer> que) {
        System.out.println(que.peek());
    }

    private static void dequeue(Queue<Integer> que) {
        System.out.println();
        que.poll();
    }

    private static void enqueue(Queue<Integer> que, Random random) {
        System.out.println();
        int elem = random.nextInt(1, 11);
        que.add(elem);
        System.out.printf("В очередь добавлен эелемент %d", elem);
        System.out.println();
    }

    public static void main(String[] args) {
        Random random = new Random();
        Queue<Integer> que = new LinkedList<Integer>();
        enqueue(que, random);
        enqueue(que, random);
        enqueue(que, random);
        System.out.println("Тек. очередь: " + que);
        dequeue(que);
        System.out.print("Очередь после удаления элемента: ");
        System.out.println(que);
        System.out.print("Возврат элемента на первой позиции в очереди без удаления: ");
        first(que);
        System.out.println("Текущая очередь: " + que);
    }

}