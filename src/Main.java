public class Main {
    public static void main(String[] args) {
        //task1
        int clientOS = 1;
        if (clientOS==0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if(clientOS==1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //task2

       int clientOS2 = 1;
        int clientDiviseYear = 2015;
        if(clientDiviseYear>=2015&&clientOS2==0){
            System.out.println("Установите версию приложения для iOS по ссылке");
            }else if(clientDiviseYear>=2015&&clientOS2==1){
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        else if(clientDiviseYear<2015&&clientOS2==0){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }else if(clientDiviseYear<2015&&clientOS2==1){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }


        //task3
        int year = 100;
        if (year%400==0||(year%4==0&&year%100!=0)){
            System.out.println(year+" год является високосным");
        }
        else{
            System.out.println(year+" год не является високосным");
        }

        //task4
        int deliveryDistance = 95;
        int day = 1;
        if(deliveryDistance <=20){
            System.out.println("Потребуется дней: "+ day);
        }else if(deliveryDistance>20&&deliveryDistance<=60){
            System.out.println("Потребуется дней: "+(day+1));
        }else if(deliveryDistance>60&&deliveryDistance<=100){
            System.out.println("Потребуется дней: "+(day+2));
        }else{
            System.out.println("Доставки нет");
        }

        //task5
        int monthNumber =12;
        switch(monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }
}