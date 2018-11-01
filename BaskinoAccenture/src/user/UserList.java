package user;

import java.util.HashMap;
import java.util.Map;

public class UserList {

    static HashMap<String, User> usersMap = new HashMap<>();

    public static boolean logger(String login, String password){
        return usersMap.get(login).toString().equals(password);
    }




////    Список пользователей
//    private static List<User> myList = new ArrayList<>();
//
//
////    Возвращаем ссылку на пользователя
//    public static User getUser(String login){
//        for (User u : myList){
//            if (u.getLogin().equals(login)){
//                return u;
//            }
//        }
//        return null;
//    }
//    public static User getId(String id){
//        for (User u : myList){
//            if (u.getId().equals(id)){
//                return u;
//            }
//        }
//        return null;
//    }
//
//
////    Добавление пользователя
//    public static void addUser(String login, String password, String id){
//        if (getUser(login) == null && getId(id) == null){
//            myList.add(new User(login, password, id));
//        } else {
//            System.out.println("Пользователь с таким логином или id уже существует!");
//        }
//
//
//    }
//
//            protected static boolean logger(String loginUser, String passwordUser){
//                boolean logIn = false;
//                for (User u : myList){
//                    if (u.getPassword().equals(passwordUser)){
//                        if (getUser(loginUser) == u){
//                            logIn = true;
//                            return logIn;
//                        }
//                    }
//                }
//                return logIn;
//            }
}
