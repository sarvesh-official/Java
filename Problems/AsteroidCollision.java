package Problems;

import java.util.Stack;

public class AsteroidCollision {

    public static int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {

            //^ if stack is empty or a positive value arrives then perform blind insertion 

            if (stack.isEmpty() || asteroids[i] > 0) {

                stack.push(asteroids[i]);

            } else {
                while (!stack.isEmpty()) {

                    int top = stack.peek();

                    if (top < 0) {
                        stack.push(asteroids[i]);
                        break;
                    }

                    int modVal = Math.abs(asteroids[i]);

                    if (modVal == top) {
                        stack.pop();
                        break;

                    } else if (modVal < top) {
                        break;
                    } else {
                        stack.pop();
                        if (stack.isEmpty()) {
                            stack.push(asteroids[i]);
                            break;
                        }
                    }
                }
            }
        }
        int ansArray[] = new int[stack.size()];

        for (int i = stack.size() - 1; i >= 0; i--) {
            ansArray[i] = stack.pop();
        }
        return ansArray;
    }
    public static void main(String[] args) {
        int[] arr = { -2, -1, 1, 2 };

        System.out.println(asteroidCollision(arr));
        
    }
}
