package singleton.example.singleton5;

// Lazy Holder(중첩 클래스)
// 불필요한 자원낭비 없이 getInstance()가 호출될 때 Holder 클래스가 로딩되어 인스턴스를 생성한다.
public class Singleton {
   private static class SingletonInstanceHolder{
       private static final Singleton INSTANCE = new Singleton();
   }

    public static Singleton getInstance() {
        return SingletonInstanceHolder.INSTANCE;
    }
}
