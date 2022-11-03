public class homework2 {
    public static void main(String[] args) {


        /// Задача 1
        System.out.println("Задача 1 ");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println("Год является высокосным " + i);
        }

        /// Задача 1 решение 2
        System.out.println("Задача 1 решение 2");
        for (int i = 1904; i < 2096; i++) {
            if (i % 4 == 0) {
                System.out.println("Год является высокосным " + i);
            }
        }

        /// Задача 2
        System.out.println("Задача 2 ");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        /// Задача 3
        System.out.println("Задача 3 ");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }


    }
}
