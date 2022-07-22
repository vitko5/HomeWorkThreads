import java.util.Scanner;

public class Main {

    // Створити потік. Створити клас MyThread наслідувати його від класу Thread. Перевизначити метод run(),
    // так щоб можна було вивести введену з консолі кількість чисел Фібоначі. Тобто ми вводимо з консолі скільки
    // ми хочемо бачити чисел Фібоначі і ми їх виводимо з затримкою в 1 секунду.
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter cout of digits fibonachy: ");
       MyThread thread = new MyThread(sc.nextInt());
       thread.start();
    }

}
