package p03_ifElseStatements;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {

        //Soru 1-Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //       “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter tusunu kullanarak ucgen için ayrı ayrı uc kenar uzunlugu giriniz");
        int kenar1= scanner.nextInt();
        int kenar2= scanner.nextInt();
        int kenar3= scanner.nextInt();

        if (kenar1==kenar2 && kenar1==kenar3 && kenar1>0) {
            System.out.println("Eskenar ucgen");

        }else System.out.println("Eskenar degil");
    }
}

