package singleton.user;

public class UserSingleton {
    private String name;

    private static class LazyHolder {
        private static final UserSingleton INSTANCE = new UserSingleton();
    }

    public static UserSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
