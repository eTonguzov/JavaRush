package javarush.level5.task0528;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/

public class Solution {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd MM YYYY");
        System.out.println(df.format(date));

    }
}
