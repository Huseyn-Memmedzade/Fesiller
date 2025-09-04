package yenipabka;

import java.util.Scanner;

public class Fesiller {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ayi Daxil Edin");
        String ay = sc.nextLine().toLowerCase();


        switch (ay) {
            case "dekabr", "yanvar", "fevral":
                System.out.println("Qis Fesili");
                break;
            case "mart", "aprel", "may":
                System.out.println("Yaz Fesili");
                break;
            case "iyun", "iyul", "avqust":
                System.out.println("Yay Fesili");
                break;
            case "sentyabr", "oktyabr", "noyabr":
                System.out.println("Payız Fesili");
                break;
            default:
                System.out.println("Bele Bir Ay Movcud Deyil");
                break;

        }

    }


}
