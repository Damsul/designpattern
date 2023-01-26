package singleton.example;

public class Client {

    public static void main(String[] args) {
        UserService user1 = UserService.getInstance();
        UserService user2 = UserService.getInstance();

        System.out.println(user1.equals(user2));
    }

}
