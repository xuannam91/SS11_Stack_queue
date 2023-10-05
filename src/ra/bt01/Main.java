package ra.bt01;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i <10 ; i++) {
            queue.offer((int) (Math.random()*10));

            System.out.println(queue.element());
        }
        System.out.println(queue);
    }
}
