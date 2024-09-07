import java.util.Scanner;
public class Main {

    public static void hello(){
        System.out.println("Hello World");
    }

    public static void second(){
        float a, b, с;
        Scanner scan = new Scanner(System.in);
        System.out.print("\nВведите первое число: ");
        a = scan.nextFloat();
        System.out.print("Второе: ");
        b = scan.nextFloat();
        System.out.print("Третье: ");
        с = scan.nextFloat();
        System.out.println("Ваши числа: " + a + ", " + b + ", " + с);
        System.out.println("Их произведение: " + a*b*с);
        System.out.println("Среднее арифметическое: " + (a+b+с)/3);

        if (a >= b) {
            if (a >= с){
                if (с >= b) {
                    System.out.println("Ваши числа в порядке возрастания: " + b + ", " + с + ", " + a);
                } else System.out.println("Ваши числа в порядке возрастания: " + с + ", " + b + ", " + a);
            } else System.out.println("Ваши числа в порядке возрастания: " + b + ", " + a + ", " + с);
        } else if (a >= с) System.out.println("Ваши числа в порядке возрастания: " + с + ", " + a + ", " + b);
        else if (b >= с) System.out.println("Ваши числа в порядке возрастания: " + a + ", " + с + ", " + b);
        else System.out.println("Ваши числа в порядке возрастания: " + a + ", " + b + ", " + с);

    }
    public static void third(){
        int n1, n2, n3;
        Scanner scan = new Scanner(System.in);
        System.out.print("\nВведите первое целое число: ");
        n1 = scan.nextInt();
        System.out.print("Второе: ");
        n2 = scan.nextInt();
        System.out.print("Третье: ");
        n3 = scan.nextInt();
        System.out.println("Ваши числа: " + n1 + ", " + n2 + ", " + n3);
        System.out.println("Их произведение: " + n1*n2*n3);
        System.out.println("Среднее арифметическое: " + (double)(n1+n2+n3)/3);
        if (n1 >= n2) {
            if (n1 >= n3){
                if (n3 >= n2) {
                    System.out.println("Ваши числа в порядке возрастания: " + n2 + ", " + n3 + ", " + n1);
                } else System.out.println("Ваши числа в порядке возрастания: " + n3 + ", " + n2 + ", " + n1);
            } else System.out.println("Ваши числа в порядке возрастания: " + n2 + ", " + n1 + ", " + n3);
        } else if (n1 >= n3) System.out.println("Ваши числа в порядке возрастания: " + n3 + ", " + n1 + ", " + n2);
        else if (n2 >= n3) System.out.println("Ваши числа в порядке возрастания: " + n1 + ", " + n3 + ", " + n2);
        else System.out.println("Ваши числа в порядке возрастания: " + n1 + ", " + n2 + ", " + n3);
    }

    public static void fourth() {
        float second_task_n1, second_task_n2, second_task_n3, D;
        Scanner scan = new Scanner(System.in);
        System.out.print("\nВведите первое число: ");
        second_task_n1 = scan.nextFloat();
        System.out.print("Второе: ");
        second_task_n2 = scan.nextFloat();
        System.out.print("Третье: ");
        second_task_n3 = scan.nextFloat();
        D = second_task_n2 * second_task_n2 - 4 * second_task_n1 * second_task_n3;
        if (D < 0){
            System.out.println("Нет корней");
        } else if (D == 0) {
            System.out.println("Один корень: " + ((-second_task_n2) / (2 * second_task_n1)));
        } else System.out.println(
                "Первый корень = " + ((-second_task_n2 + Math.sqrt(D)) / (2 * second_task_n1))
                        + " Второй корень равен: " + ((-second_task_n2 - Math.sqrt(D)) / (2 * second_task_n1)));

    }

    public static void fifth(double range1, double range2, double shag) {
        for (range1 = range1; range1 <= range2; range1 += shag) {
            System.out.println("Значение x: " + range1 + " Значение sin(x): " + Math.sin(range1));
        }
    }

    public static void sixth(double a1, double b1, double c1, double a2, double b2, double c2){
        Scanner scan = new Scanner(System.in);
        System.out.println("Значение x: " + ((c1*b2 - c2*b1) / (a1*b2 - a2*b1)) + " Значение у: " + (c1 - a1 * (c1*b2 - c2*b1) / (a1*b2 - a2*b1)));
    }

    public static double seventh(double ans, double x, double x_copy, double num, double accuracy){
        for (int i = 1;;i++){
            x = x*x_copy;
            num = num*i;
            if (x/num < accuracy) break;
            ans+=x/num;
        }
        return ans;
    }

    public static int getRandom()
    {
        return (int) (Math.random() * 15);
    }

    public static int[] getRandomArray()
    {
        int[] array = new int[getRandom()];
        for (int i = 0; i < array.length; i++){
            array[i] = getRandom();
        }
        return array;
    }

    public static void eighth(int[] array) {
        System.out.print("Ваш массив: ");
        for (int i = 0;i<array.length;i++) {
            System.out.print(array[i] + " ");
        }

    }

    public static int[] ninth() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int[] array = new int[scan.nextInt()];
        for (int i = 0;i<array.length;i++) {
            System.out.print(i + " элемент массива: ");
            array[i] = scan.nextInt();
        }
        return array;
    }

    public static int tenth(int[] array) {
        int sum = 0;
        for (int i = 0;i<array.length;i++) {
            sum+= array[i];
        }
        return sum;
    }

    public static int eleventh(int[] array) {
        int count = 0;
        for (int i = 0;i<array.length;i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int twelfth(int[] array, int a, int b) {
        int count = 0;
        for (int i = 0;i<array.length;i++) {
            if (array[i] <= b && array[i] >= a) {
                count++;
            }
        }
        return count;
    }


    public static boolean thirteenth(int[] array) {
        for (int i = 0;i<array.length;i++) {
            if (array[i] < 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] fourteenth(int[] array) {
        int bufer;
        for (int i = 0; i < array.length/2; i++) {
                bufer = array[i];
                array[i] = array[array.length-1-i];
                array[array.length-1-i] = bufer;
        }
        return array;
    }

    public static int choice(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер задания: ");
        return scan.nextInt();
    }

    public static void main(String[] args) {
        int choice;
        switch (choice()) {
            case (1):
                hello();
                break;
            case (2):
                second();
                break;
            case (3):
                third();
                break;
            case (4):
                fourth();
                break;
            case (5):
                fifth(0,1.57,0.5);
                fifth(0,6.28,3.14/4);
                fifth(0,3.14,3.14/8);
                break;
            case (6):
                sixth(1, 2, 4, 2, 1, 5);
                break;
            case (7):
                System.out.println("Ответ: " + seventh(1, 0.5, 0.5, 1, 0.001));
                break;
            case (8):
                eighth(getRandomArray());
                break;
            case (9):
                eighth(ninth());
                break;
            case (10):
                System.out.println("Длина массива: " + tenth(ninth()));
                break;
            case (11):
                System.out.println("Количество четных чисел в массиве: " + eleventh(ninth()));
                break;
            case (12):
                System.out.println("Количество элементов в массиве, принадлежащих вашему отрезку: " + twelfth(ninth(), 0, 5));
                break;
            case (13):
                System.out.println("Все ли элементы положительные? Ответ: " + thirteenth(ninth()));
                break;
            case (14):
                eighth(fourteenth(ninth()));
                break;
        }
    }
}

