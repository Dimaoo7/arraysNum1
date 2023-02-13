public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int[] numbers = new int[]{1, 2, 3};

        for (int i = 0; i < 3; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(" ");
        double[] swim = new double[]{1.57, 7.654, 9.986};
        for (int i = 0; i < 3; i++) {
            System.out.print(swim[i]+ " ");
        }
        System.out.println(" ");

            byte[] hz = new byte[]{21, 42, 32};
        for (int i = 0; i < 3; i++) {
            System.out.print(hz[i]+ " ");
        }
        System.out.println(" ");
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int[] numbers = new int[]{1, 2, 3};

        for (int i = 2; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(" ");
        double[] swim = new double[]{1.57, 7.654, 9.986};
        for (int i = 2; i >= 0; i--) {
            System.out.print(swim[i]+ " ");
        }
        System.out.println(" ");

        byte[] hz = new byte[]{21, 42, 32};
        for (int i = 2; i >= 0; i--) {
            System.out.print(hz[i]+ " ");
        }
        System.out.println(" ");
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int[] numbers = new int[]{1, 2, 3};

        for (int i = 0; i <= 2; i++) {

            if ((numbers[i] %2) == 0){
                System.out.print(numbers[i] + " ");
            } else {
                numbers[i]++;
                System.out.print(numbers[i] + " ");
            }
        }


    }

}