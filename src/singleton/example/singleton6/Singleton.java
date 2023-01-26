package singleton.example.singleton6;

// 이중확인잠금(DCL)
// Double Checked Locking, 잠금 전에 한번, 객체 생성 전에 한번 인스턴스 생성 여부를 체크하면 인스턴스가 존재할 때만 잠금을 걸 수 있기 때문에 앞서 생겼던 문제점을 해결할 수 있다.
public class Singleton {

    private volatile Singleton instance;

    private Singleton() {

    }

    public Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
