public class Main {
    public static void main(String[] args) {

        // Задача 1
        double sum = 0;
        int finalSum = 2_459_000;
        int monthlyAddition = 15_000;
        int months = 0;
        double interest = 1.01;
        while (sum < finalSum) {
            sum = (sum + monthlyAddition) * interest;
            months++;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей", months, sum);
            System.out.println();
        }

        // Задача 2
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }

        System.out.println();

        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        // Задача 3
        int population = 12_000_000;
        int birthsPerThousand = 17;
        int deathsPerThousand = 8;
        int currentYear = 2024;
        int yearsInterval = 10;
        for (int year = currentYear; year <= currentYear + yearsInterval; year++) {
            population = population + (birthsPerThousand - deathsPerThousand) * population / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }

        // Задача 4
        interest = 0.07;
        sum = 15_000;
        finalSum = 12_000_000;
        months = 0;
        while (sum < finalSum) {
            sum = sum + sum * interest;
            months++;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей", months, sum);
            System.out.println();
        }
        System.out.println("Василию надо копить " + months + " месяцев");

        // Задача 5
        sum = 15_000;
        months = 0;
        while (sum < finalSum) {
            sum = sum + sum * interest;
            months++;
            if (months % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей", months, sum);
                System.out.println();
            }
        }
        System.out.println("Василию надо копить " + months + " месяцев");

        // Задача 6
        sum = 15_000;
        yearsInterval = 9;
        months = 0;
        while (months < yearsInterval * 12) {
            sum = sum + sum * interest;
            months++;
            if (months % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей", months, sum);
                System.out.println();
            }
        }
        System.out.printf("За " + months + " месяцев Василий накопил %.2f рублей", sum);
        System.out.println();

        // Задача 7
        int firstFriday = 3;
        int lastDayInMonth = 31;
        for (int currentDayOfMonth = 1; currentDayOfMonth <= lastDayInMonth; currentDayOfMonth++) {
            if ((currentDayOfMonth - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + currentDayOfMonth + "-е число. Необходимо подготовить отчет");
            }
        }

        // Задача 8
        int period = 79;
        int startOfObservation = currentYear - 200;
        int endOfObservation = currentYear + 100;
        for (int year = 0; year <= endOfObservation; year = year + period) {
            if (startOfObservation <= year) {
                System.out.println(year);
            }
        }
    }
}