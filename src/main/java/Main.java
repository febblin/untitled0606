import java.util.Scanner;

public final class Main {
    public static void main(String[] args){
        int i =6;  //32bit целое
        long l;  //64bit целое
        short s;
        byte aByte;
        char ch = 'r';
        float f; //32bit дробное
        double d; //64bit дробное
        boolean b;

        //________________________________

        int[] ints = {1,2,3,4};
        String str = "Привет Мир!";
        String str2 = "Привет Мир!";
        str += '?';
        System.out.println(str + " " + i + ", штук!");


        int[] tmp = new int[ints.length + 10];
        for (int j=0;j< ints.length;j++){
            tmp[j] = ints[j];
        }
        ints = tmp;

        if (str.equals(str2)) System.out.println(true);
        if (str != str2) System.out.println(false);

        i=0;
        for (int j=0, k=10; j<10 & (k>j/2 || k>60); j++, k-=2, i+=j);

        boolean t = i % 12 != 0;
        t = false;

        System.out.println(i);

        Scanner scanner = new Scanner(System.in);
        String str3 = scanner.nextLine();
        System.out.println(str3);

    }
}