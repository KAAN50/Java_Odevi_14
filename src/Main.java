import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int yil;



        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");

        yil = input.nextInt();




        if (yil % 400 ==0 )
        {
            System.out.println("Girdiğiniz Yıl Artık Yıl");
        }
        else if (yil%100!=0 && yil %4==0)
        {
            System.out.println("Girdiğiniz Yıl Artık Yıl");
        }
        else
        {
            System.out.println("Girdiğiniz Yıl Artık Yıl Değil");
        }


    }
}