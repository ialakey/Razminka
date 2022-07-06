package razminka;

import java.util.Scanner;

public class Razminka {
    
    public static void main(String[] args) {
              
        inputData();
    }
   

    public static void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите 3 слова: ");
        String inputString = sc.nextLine();
        reverseString(inputString);
    }
    
    public static void reverseString(String inputString) {

        long timeFirst = System.currentTimeMillis();
        long timeSecond = System.currentTimeMillis();
        long timeThird = System.currentTimeMillis();
        String reversedString = new StringBuffer(inputString).reverse().toString();
        System.out.println("Итоговое слово: " + reversedString);

        for (int i=0; i<1000; i++) {
          reversedString = new StringBuffer(inputString).reverse().toString();
        }
        System.out.println(System.currentTimeMillis() - timeFirst + " - 1000");
        for (int i=0; i<10000; i++) {
          reversedString = new StringBuffer(inputString).reverse().toString();
        }
        System.out.println(System.currentTimeMillis() - timeSecond + " - 10000");
        for (int i=0; i<100000; i++) {
          reversedString = new StringBuffer(inputString).reverse().toString();
        }
        System.out.println(System.currentTimeMillis() - timeThird + " - 10000");
     }
   
}
