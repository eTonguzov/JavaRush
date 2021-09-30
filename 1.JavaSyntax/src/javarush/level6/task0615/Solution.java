package javarush.level6.task0615;

/*
Переставь один модификатор static,чтобы пример скомпилировался
*/
public class Solution {

    static public int A = 5;
    /*Здесь переменная А, Static потому-что
    статический класс main может обращаться только к static переменной
     */
    public int B = 2;
    public int C = A * B;

    public static void main(String[] args) {
        A = 15;
    }
}