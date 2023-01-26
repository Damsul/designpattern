package singleton.example.singleton3;

// 정적 멤버
// 클래스 로딩 때 인스턴스 생성
// 불필요한 자원낭비 -> 인스턴스가 필요없는 경우에도 인스턴스 생성하기 때문
public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }
}
