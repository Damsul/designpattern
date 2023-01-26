package singleton.example.singleton2;

// 동기화
// 인스턴스 반환하기 전까지 잠금할 수 있음
// getInstance() 메서드 호출할 때마다 잠글이 걸려 성능저하
public class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    public synchronized static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
