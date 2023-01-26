package singleton.example.singleton7;

// enum
// 기본적으로 스레드 세이프 보장
// 멤버 변수화 메서드도 정의 가능
public enum Singleton {
    INSTANCE;

    private int value = 3;

    public int getValue() {
        return value;
    }
}
