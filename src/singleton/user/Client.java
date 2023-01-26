package singleton.user;

public class Client {

    public static void main(String[] args) {
        UserSingleton user1 = UserSingleton.getInstance();
        user1.setName("Damsul");
        System.out.println(user1.getName());
    }

}
