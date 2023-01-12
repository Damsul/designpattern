package proxy;

public class Proxy_Movie implements Movie{
    private String name;
    private Real_Movie realMovie;

    public Proxy_Movie(String name) {
        this.name = name;
    }

    @Override
    public void setMovieName(String name) {
        this.name = name;
    }

    @Override
    public String getMovieName() {
        return this.name;
    }

    @Override
    public void start() {
        // 실제 영화 객체의 이름과 프록시 영화의 이름이 다른 경우
        // 다시 다운로드 받게 한다.
        realize();
        realMovie.start();
    }

    private synchronized void realize() {
        if (realMovie == null || !realMovie.getMovieName().equals(name)) {
            realMovie = new Real_Movie(this.name);
        }
    }
}
