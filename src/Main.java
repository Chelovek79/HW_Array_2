import java.sql.Array;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class Main {
   public static int [] generateRandomArray() {
       java.util.Random random = new java.util.Random();
       int [] arr = new int [30];
       for (int i = 0; i < arr.length; i++) {
           arr [i] = random.nextInt(100_000) + 100_000;
       }
        return arr;
   }
   public static void main(String[] args) {

       NumberFormat divider = NumberFormat.getInstance(new Locale("ru", "RU")); // Разделяем на 1000;

// Задание 1.
       int SummMonthPayment = 0;
       int [] arr = generateRandomArray();
       for (int j : arr) {
           SummMonthPayment = SummMonthPayment + j;
       }
       System.out.println("Сумма трат за месяц составила " + divider.format(SummMonthPayment) + " рублей.");

// Задание 2.
       int maxPaymentDay = 0;
       int minPaymentDay = 200_000;
       for (int i : arr) {
           if (i > maxPaymentDay) {
               maxPaymentDay = i;
           }
           if (i < minPaymentDay) {
               minPaymentDay = i;
           }
       }
       System.out.println("Минимальная сумма трат за день составила " + divider.format(minPaymentDay) + " рублей.");
       System.out.println("Максимальная сумма трат за день составила " + divider.format(maxPaymentDay) + " рублей.");

// Задание 3.
       double averagePaymentMonth = (double) SummMonthPayment / arr.length;
       averagePaymentMonth = Math.round(averagePaymentMonth * 100.0) / 100.0; // Округляем до двух знаков после запятой;
       System.out.println("Средняя сумма трат за месяц составила " + divider.format(averagePaymentMonth) + " рублей.");
       System.out.println("--------------------------------------");

// Задание 4.
       char [] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
       for (int i = reverseFullName.length-1; i >= 0; i--) {
           System.out.print(reverseFullName[i] + " ");
       }
   }
}