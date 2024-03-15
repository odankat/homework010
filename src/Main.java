import java.time.LocalDate;

public class Main {
    public static void definitionOfYear(int year) {
        if (year > 1584 && (year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0 && year > 1584) {
            System.out.println(" Год является високосным !");
        } else System.out.println(" Год не является високосным !");

    }

    public static void definitionApplications(int clientOs, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOs == 1 && clientDeviceYear < currentYear) {
            System.out.println(" Установите облегченную версию приложения для Android по ссылке ");
        } else if (clientOs == 1 && clientDeviceYear >= currentYear) {
            System.out.println(" Устанвоите версию приложения для Android по ссылке ");
        }
        if (clientOs == 0 && clientDeviceYear < currentYear) {
            System.out.println(" Установите облегченнную версию приложения для IOS по ссылке");
        } else if (clientOs == 0 && clientDeviceYear >= currentYear) {
            System.out.println(" Установите версию приложения для IOS по ссылке");
        }
    }

    public static int deliveryTime(int deliveryDistance) {
        int deliveryTime = 0;
        if (deliveryDistance < 20 && deliveryDistance >= 0) {
            return 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            return 2;
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            return 3;
        }
        return deliveryTime;
    }


    public static void main(String[] args) {

        // Task 1
        System.out.println("Task 1");
        int year = 2021;
        definitionOfYear(year);

        // Task 2
        System.out.println("Task 2");
        int clientDeviceYear = 2024;
        int clientOs = 1;
        definitionApplications(clientOs, clientDeviceYear);

        // Task 3
        System.out.println("Task 3");
        int deliveryDistance = 50;
        int deliveryTime = deliveryTime(deliveryDistance);
        if (deliveryTime == 0) {
            System.out.println("Доставка не доступна");
        } else {
            System.out.println("Доставка займет " + deliveryTime + " дня");
        }


    }
}