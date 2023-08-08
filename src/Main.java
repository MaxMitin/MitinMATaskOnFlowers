import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println(" ");
        System.out.println("Имеются три цветка в следующей изначальной последовательности слева-направо: Герань ('G'), Крокус ('C'), Фиалка ('V')");

        try{
            ArrayDeque<String> row = new ArrayDeque<>(Arrays.asList("G", "C", "V"));
            StringBuilder res = null;

            int knumber;
            Scanner sc = new Scanner(new File("k.txt"));
            knumber = Integer.valueOf(sc.nextInt());
            for(int i = 0; i < knumber; i++){row.addFirst(row.getLast()); row.removeLast();}

            for(String flowers: row){if(res != null){
                res.append(" " + flowers);
            }else{
                res = new StringBuilder(flowers);
            }
            }
            System.out.println(" ");
            System.out.println("По истечении указанного в исходном файле числа дней цветы стоят в следующей последовательности: " + res + ".");

        } catch (FileNotFoundException e){System.out.println("Ой!");}
    }
}