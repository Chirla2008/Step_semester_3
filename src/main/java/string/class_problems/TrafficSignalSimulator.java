package string.class_problems;
public class TrafficSignalSimulator {

    public static void simulateTrafficSignal(int cycles) {
        int state = 0; // 0 = Red, 1 = Green, 2 = Yellow

        for (int i = 0; i < cycles; i++) {
            switch (state) {
                case 0:
                    System.out.println("Red - Stop");
                    break;
                case 1:
                    System.out.println("Green - Go");
                    break;
                case 2:
                    System.out.println("Yellow - Prepare to stop");
                    break;
            }
            // Advance to the next state and wrap back to 0 using modulus
            state = (state + 1) % 3;
        }
    }

    public static void main(String[] args) {
        // Test case from sample output
        simulateTrafficSignal(3);
    }
}
