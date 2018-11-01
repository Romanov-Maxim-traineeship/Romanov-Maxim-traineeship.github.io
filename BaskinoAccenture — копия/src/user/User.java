package user;

public class User {
   private String login;
   private String password;
   private String id;


//    Конструктор
    User(String login, String password, String id){
        this.login = login;
        this.id = id;
        this.password = cripter(password);
    }


    public String getLogin() {

        return this.login;
    }

    public String getId() {

        return this.id;
    }
    public String getPassword(){

        return deCripter(this.password);
    }


//    Шифровщик
    public static String cripter(String password){
        return "cripter" + password;
    }

//    Дешифровщик
    public static String deCripter(String password){
        return password.replaceAll("cripter", "");
    }

//    @Override
//    public String toString() {
//        return "Пользователь №" + this.id + ": " + this.login;
//    }

}
