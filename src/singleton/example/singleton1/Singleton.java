package singleton.example.singleton1;

// 단순한 메서드 호출
// 원자성이 결어되어 있음, 멀티 스레드 환경에서 인스턴스를 2개 이상 만들 수 있음.
public class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

}
