package ProblemOfTheDay;

import java.util.Deque;
import java.util.LinkedList;

public class RotateDeque {
    public static void rotateDeque(Deque<Integer> dq, int type, int k) {
        // If the deque is empty, no rotation is needed.
        if (dq.isEmpty()) {
            return;
        }

        // Get the actual number of rotations needed (k mod size of deque)
        int size = dq.size();
        k = k % size;

        if (k == 0) {
            return;  // No need to rotate if k is 0 after modulo operation
        }

        if (type == 1) {
            // Right rotation (Clockwise): Move the last element to the front
            for (int i = 0; i < k; i++) {
                dq.addFirst(dq.removeLast());
            }
        } else if (type == 2) {
            // Left rotation (Anti-clockwise): Move the first element to the back
            for (int i = 0; i < k; i++) {
                dq.addLast(dq.removeFirst());
            }
        }
    }

    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.add(1);
        dq.add(2);
        dq.add(3);
        dq.add(4);
        dq.add(5);

        System.out.println("Original Deque: " + dq);

        rotateDeque(dq, 1, 2); // Right rotate by 2
        System.out.println("After Right Rotation by 2: " + dq);

        rotateDeque(dq, 2, 3); // Left rotate by 3
        System.out.println("After Left Rotation by 3: " + dq);
    }
}
