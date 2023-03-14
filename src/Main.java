public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    private static void task1() {
        //Задача 1
        int total=0;
        int salary=15000;
        int month=0;
        while(total<2459000){
            total=total+salary;month++;System.out.println(" Месяц "+month+" равно "+total);}
    }
    private static void task2() {
        //Задача 2
        int i=0;
        while (i<10){i++;System.out.print (" "+i+" ");}
        System.out.println();
        for(;i>0;i--){System.out.print(" "+i+" ");}
        System.out.println();

    }
    private static void task3() {
        //Задача 3
        int total=12_000_000;
        int birthRate=17;
        int mortality=8;
        int ear=0;
        while (ear<10){
            ear++;total+=total/1000*birthRate-total/1000*mortality;
            System.out.println("Год "+ear+" численность населения составляет "+total);}
    }
    private static void task4() {
        //Задача 4
        int total=0;
        int salary=15000;
        int month=0;
        while(total<12000000){
            total=total+7*total/100;
            total=total+salary;month++;
            System.out.println(" Месяц "+month+" равно "+total);}
        }
    private static void task5() {
        //Задача 5
        int total=0;
        int salary=15000;
        int month=0;
        while(total<12000000){
            total=total+7*total/100;
            total=total+salary;month++;
            if (month%6==0){
            System.out.println(" Месяц "+month+" равно "+total);}
            }
    }
    private static void task6() {
        //Задача 6
        int total=0;
        int salary=15000;
        int month=0;
        while(month<108){
            total=total+7*total/100;
            total=total+salary;month++;
            if (month%6==0){
                System.out.println(" Месяц "+month+" равно "+total);}
        }
    }
    private static void task7() {
        //Задача 7
        int i=3;
        System.out.println("Сегодня пятница "+i+"-е число. Необходимо подгогтовить отчет");
        while (i<31){
            i=i+7;
        System.out.println("Сегодня пятница "+i+"-е число. Необходимо подгогтовить отчет");}
    }
    private static void task8() {
        //Задача 8
        int yearL=1820;
        int yearF=2023;
        while (yearL<2023) {
            yearL++;
            if (yearL % 79 == 0) {
                System.out.println(yearL);
            }
        }
        while (yearF<2123) {
            yearF++;
            if (yearF % 79 == 0) {
                System.out.println(yearF);
            }
        }
        }

    }





