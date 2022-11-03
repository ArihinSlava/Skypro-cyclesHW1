public class homework3 {
    public static void main(String[] args) {

        /// Задача 1/2
        System.out.println(" Задача 1/2 ");
        int savings = 29000;
        int total = 0;
        for (int i = 1; i <= 12 ; i++){
            total = total + total/12;
            total = total + savings;
            System.out.println(" Месяц " + i + " сумма накоплений равна " + total + " рублей ");
        }

    }
}
