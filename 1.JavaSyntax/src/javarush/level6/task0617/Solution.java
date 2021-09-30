package javarush.level6.task0617;

/*
Блокнот для новых идей
1. В классе Solution создать public static класс Idea.
2. В классе Idea создать метод public String getDescription(), который будет возвращать любую строку.
3. В классе Solution создай статический метод public void printIdea(Idea idea),
который будет выводить на экран описание идеи - это то, что возвращает метод getDescription().
*/

public class Solution {
    public static void main(String[] args) {
        printIdea(new Idea());
    }
    public static void printIdea(Idea idea){
        //String idea = "Идея";
        System.out.print(idea.getDescription());
    }

    public static class Idea{
        public String getDescription(){
              String idea = "It's idea";
            return idea;
        }

    }
}