import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Задача 1. Введите год, чтобы проверить високосный он или нет: ");
        int currentYear = console.nextInt();
        checkingYearForLeap(currentYear);
        System.out.println("Задача 2. Введите тип операционной системы (0 - IOS, 1 - Android) и год выпуска устройства: ");
        int operationSystem = console.nextInt();
        int deviceYear = console.nextInt();
        downloadVersion(operationSystem, deviceYear);
        System.out.println("Задача 3. Введите расстояние от офиса до адреса доставки: ");
        int clientDistance = console.nextInt();
        System.out.print("Доставка займет " + calculatingDeliveryTime(clientDistance) + " дней");

    }

    public static void checkingYearForLeap(int year) {
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " год является високосным");
        } else{
            System.out.println(year + " год не является високосным");
        }
    }

    public static void downloadVersion(int clientOS, int clientDeviceYear){
                if (clientOS == 0 && clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для IOS по ссылке");
                } else if (clientOS == 0 && clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для IOS по ссылке");
                }else if(clientOS == 1 && clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else if (clientOS == 1 && clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
        }

    public static int calculatingDeliveryTime(int deliveryDistance) {
        int deliveryTime = 0;
        if(deliveryDistance <= 20){
            deliveryTime = deliveryTime + 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime = deliveryTime + 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime = deliveryTime + 3;
        } else if(deliveryDistance > 100){
            deliveryTime = 0;
        }
        return deliveryTime;
    }
}