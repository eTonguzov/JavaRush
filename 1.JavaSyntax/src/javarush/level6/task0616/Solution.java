package javarush.level6.task0616;

/*
Расставь минимальное количество static-ов,
чтобы код начал работать, и программа успешно завершилась.
*/

public class Solution {
    public int step;

    public static void main(String[] args) {
        method1();
        // main вызывает не статический method1.
        //Т.к. мы не можем из статического метода вызвать не статический,
        // добавляем static к method1
    }

    public static void method1() {
        method2();
        //аналогино
    }

    public static void method2() {
        new Solution().method3();
        /*
        В статичном методе method2() создается Объект этого класса
        При создании объекта, происходит инициализация переменных объекта.
         Вызывается метод method3() в контексте созданного объекта.(В method3 передается ссылка на созданный объект).
         */
    }

    public void method3() {
        method4();
        /*
        Из method3() вызывается метод method4().
         Так как метод3 - метод объекта, то у него более широкий контекст,
          ему доступны не только статичные методы его класса,
          но и другие методы этого объекта, коим является method4().
           Так как для method4() мы явно не указываем объект,
           то ему передается объект метода, из которого он вызывается (method3()).
         */
    }

    public void method4() {
        step++;
        /*
         Увеличиваем переменную step. Так как у нас есть контекст класса и контекст объекта,
          переменная step может быть как статичной так и нет.
         */
        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }
        if (step > 1) {
            return;
        }
        main(null);
    }
}