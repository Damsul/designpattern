package proxy;

public class Real_Movie implements Movie {
    private String name;

    public Real_Movie(String name) {
        this.name = name;
        download(this.name);
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

        System.out.println(name + " | 상영 시작하겠습니다.");
    }

    private void download(String name) {
        System.out.println("상연 전 영화 (" + name + ") 다운로드 하겠습니다.");
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(".");
        }
        System.out.println("다운로드 완료.");

    }
}
