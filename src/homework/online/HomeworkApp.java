package homework.online;

public class HomeworkApp {

    public static void main(String[] args) {
        ThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }


    public static void ThreeWords() {
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }

    public static void checkSumSign() {
        int a = -1;
        int b = -2;
        {
            if (a + b >= 0) {
                System.out.println("Сумма положительная");
            } else {
                System.out.println("Сумма отрицательная");
            }

        }
    }

    public static void printColor() {
        int value = 10;
        {
            if (value <= 0) {
                System.out.println("Красный");
            } else if (value > 0 & value <= 100) {
                System.out.println("Желтый");
            } else {
                System.out.println("Зеленый");
            }

        }
    }

    public static void compareNumbers() {
        int a = 5;
        int b = 10;
        {
            if (a >= b) {
                System.out.println(a + " >= " + b);
            } else {
                System.out.println(a + " < " + b);
            }
        }
    }
}
