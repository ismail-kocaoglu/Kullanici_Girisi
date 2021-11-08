import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String username, password, secim,newpassword;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adı: ");
        username = input.nextLine();
        System.out.print("Şifre: ");
        password = input.nextLine();

        if (username.equals("ismail") && password.equals("1234")) {

            System.out.println("Giriş başarılı!");
        } else {
            System.out.println("Kullanıcı adı ya da şifre hatalı!");
            System.out.println("Yeni şifre oluşturmak ister misiniz? Evet ya da Hayir olarak belirtiniz!");
            secim = input.nextLine();
            if (secim.equals("Evet")) {
                System.out.println("Yeni şifreyi giriniz: ");
                newpassword=input.nextLine();
                if(newpassword.equals("1234")){
                    System.out.println("Şifre oluşturulamadı.Lütfen başka şifre giriniz!");
                } else {
                    System.out.println("Şifre başarıyla oluşturuldu!");
                }
            }
            else if (secim.equals("Hayır")){
                System.out.println("Program bitti!");
            }

        }
    }
}
