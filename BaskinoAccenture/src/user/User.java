package user;

public class User {
    private String login;
    private String password;


//    Конструктор
    User(String login, String password){
        this.login = login;
        this.password = password;
    }


//    User(String password, String id){
//        this.password = cripter(password);
//    }


    public String getLogin() {

        return this.login;
    }

    public String getPassword(){

        return this.password;
    }


////    Шифровщик
//    public static String cripter(String password){
//        return "cripter" + password;
//    }
//
////    Дешифровщик
//    public static String deCripter(String password){
//        return password.replaceAll("cripter", "");
//    }

    @Override
    public String toString() {
        return this.password;
    }

}
