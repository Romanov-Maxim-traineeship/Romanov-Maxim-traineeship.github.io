package user;
import static user.UserList.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean log = false;
        addUser("dmitry", "123", "1");
        addUser("petr", "122", "2");
        addUser("ivan", "123", "3");
        addUser("faleot", "max777", "4");

        while (true){

            Scanner scanner_login = new Scanner(System.in);
            System.out.print("Введите Логин: ");
            String loginUser = scanner_login.nextLine();

            if (getUser(loginUser) != null){
                System.out.print("Введите Пароль: ");
                String passwordUser = scanner_login.nextLine();
                log = logger(loginUser, passwordUser);
                if (log){
                    System.out.println("Добро пожаловать: " + loginUser);
                }else {
                    System.out.println("Пароль для "+ loginUser + " неверный!");
                }
            }else {
                System.out.println("Такого пользователя не существует!");
            }

            while (log){
                System.out.println("");
                System.out.print("Введите название фильма: ");
                String filmName = scanner_login.nextLine(); if (filmName.equals("logout")){log = false; }
            }




        }
    }
}
