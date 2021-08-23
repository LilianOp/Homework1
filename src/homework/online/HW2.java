package homework.online;

public class HW2 {
    public static void main(String[] args) {
System.out.println("1. " + SumCheck(21, 10));
Positive(2);
System.out.println("3. " + Negative(-1));
System.out.println("4. ");Words(15);



    }
// 1.
    public static boolean SumCheck(int a, int b) {
       int summ = a + b;
        return (summ >= 10 & summ <= 20);
        }
// 2.
        public static void Positive (int a) {

        if (a >= 0) {
            System.out.println("2. Введенное число " + a + " положительно");
        } else {
            System.out.println("2. Введеное число " + a + " отрицательно");
        }
        }
//3.
        public static boolean Negative (int a) {
        return (a < 0);
        }
//4.
        public static void Words (int a){
        for (int i = 0; i < a; i++) {
            System.out.println("String");
        }

        }
    }

