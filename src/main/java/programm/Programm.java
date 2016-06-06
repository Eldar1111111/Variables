package programm;

/**
 * Created by Eldar Tenishev on 06.06.2016.
 */

public class Programm {
    public static void main(String[] args) {
        /*int i;
        int j;*/
        int i, j; // объявили сразу две целочисленные переменные i и j
        i = 5; // проинициализировали переменные  i и j
        j = 125;
        System.out.println(i + " " + j); // вывели строку, содержащую переменные i и j и символ пробела между ними

        char x = 66; // 'B'
        char y = 67; // 'C'
        System.out.println(x + "" + y);// вывели строку, содержащую символьные переменные x, y,
        // притом компьютер перевёл числа в их символьную интерпретацию, так как это тип char

        /*int t;
        System.out.println(t);  */
        // Для того, чтобы проводить операции с переменной её нужно обязательно! проинциализировать

        boolean r = true, s = false;
        System.out.println(r + " " + s);

        String str = "Привет мир!";
        System.out.println(str);
    }

}
