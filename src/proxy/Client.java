package proxy;

public class Client {

    public static void main(String[] args) {
        Movie movie = new Proxy_Movie("공조");
        System.out.println("영화 제목 : " + movie.getMovieName());
        movie.setMovieName("신과 함께");
        System.out.println("영화 제목 : " + movie.getMovieName());
        movie.start(); // 객체 생성하고 다운로드 진행
        movie.start(); // 이미 객체가 생성되 있어 다시 다운로드를 받지 않아됨

        movie.setMovieName("범죄도시");
        System.out.println("영화 제목 : " + movie.getMovieName());
        movie.start(); // 영화가 바뀌었으므로 다시 객체를 생성해서 다운로드를 받아야 함
    }
}
