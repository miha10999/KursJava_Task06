import java.util.*;
import java.lang.*;

public class main  {

    public static void main(String[] args) {
  /*
        Задача №6: Отработка арифметических операций.
        Выполнил Хлюстов М.В.
        Условие: Написать программу, которая будет выполнять следующие действия:
            1. Ввод трех чисел с клавиатуры x, y, z
            2. Нахождение и вывод на экран среднего арифметического чисел x, y, z
            3. Деление среднего арифметического на 2 без остатка
            4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
         */
        Scanner in = new Scanner(System.in); // объявим объект для ввода
        double  number1,
          number2,
          number3,
          rezult1; // средне арифметическое

        int  rezult2; //деление без остатка
        double rezult3;
        System.out.println("Введите  первое число:");
        number1 =  in.nextDouble();//записали в переменную
        System.out.println("Введите  второе число:");
        number2 =  in.nextDouble();
        System.out.println("Введите  третье число:");
        number3 =  in.nextDouble();

        rezult1 = (number1 + number2 + number3)/3;// средне арифметическое
        System.out.println("Средне арифметическое число:" + rezult1);
        rezult2 =(int) rezult1 / 2;//  первый вариант вывода
        rezult3 = rezult1/ 2;// второй вариант вывода

        if (rezult2>3)
        {
            System.out.println("Первый вариант вывода:");
            System.out.println("Результат деления среднего арифметического на 2 без остатка :" + rezult2);
            System.out.println("Программа выполнена корректно");
}
        else  System.out.println("Программа выполнена некорректно");

        if (rezult3>3 ) {
            System.out.println("Второй вариант вывода:");
            System.out.print("Результат деления среднего арифметического на 2 без остатка :");
            System.out.printf("%.0f", rezult3);
        }
        else  System.out.print("Программа выполнена некорректно");
        System.exit(0);// завершим выполнение программы
    }
    }