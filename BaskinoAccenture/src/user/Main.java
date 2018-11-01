package user;
import movie.*;
//import movie.MovieList;
import static user.UserList.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean log = false;
        User dmitry = new User("dmitry", "123");
        User petr = new User("petr", "122");
        User ivan = new User("ivan", "123");
        User faleot = new User("faleot", "max777");

        usersMap.put(dmitry.getLogin(), dmitry);
        usersMap.put(petr.getLogin(), petr);
        usersMap.put(ivan.getLogin(), ivan);
        usersMap.put(faleot.getLogin(), faleot);

        MovieList.addMovie("престиж", "2005", "Драма");
        MovieList.addMovie("адвокат дьявола", "1997", "Детектив");
        MovieList.addMovie("адвокат", "2010", "мелодрама");
        MovieList.addMovie("зеленая миля", "2007", "Драма");
        MovieList.addMovie("миля", "2007", "Драма");
        MovieList.addMovie("матрица", "2001", "Фантастика");
        MovieList.addMovie("властелин колец", "2002", "Фантастика");


            Scanner scanner_login = new Scanner(System.in);
            System.out.print("Введите Логин: ");
            String loginUser = scanner_login.nextLine();
            if (usersMap.containsKey(loginUser)){
                System.out.print("Введите Логин: ");
                String passUser = scanner_login.nextLine();
                if (logger(loginUser, passUser)){
                    System.out.println("Привет, " + loginUser);
                }
            }




//        Review.addReview("Матрица", "Очень хороший фильм!");
//        while (true){
//
//            Scanner scanner_login = new Scanner(System.in);
//            System.out.print("Введите Логин: ");
//            String loginUser = scanner_login.nextLine();
//            if(loginUser.equals("logout")) break;
//            if (getUser(loginUser) != null){
//                System.out.print("Введите Пароль: ");
//                String passwordUser = scanner_login.nextLine();
//                log = logger(loginUser, passwordUser);
//                if (log){
//                    System.out.println("Добро пожаловать: " + loginUser);
//                }else {
//                    System.out.println("Пароль для "+ loginUser + " неверный!");
//                }
//            }else {
//                System.out.println("Такого пользователя не существует!");
//            }
//
//            while (log){
//                System.out.println("");
//                System.out.print("Введите название фильма: ");
//                String filmName = scanner_login.nextLine(); if (filmName.equals("logout")){log = false; }
////                System.out.println();
//                MovieList.searchMovie(filmName);
//            }




//        }
    }
}
