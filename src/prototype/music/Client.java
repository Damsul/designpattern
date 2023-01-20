package prototype.music;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Music music = new Music("royal44", "할 것");
        Music music_clone = (Music) music.clone();

        System.out.println("원본 : " + music.toString());
        System.out.println("복제품 : " + music_clone.toString());
        System.out.println("---------------------------------------");

        System.out.println("==노래 파일 변경==");
        music_clone.setName("비오");
        music_clone.setTitle("네가 없는 밤");
        System.out.println("복제품 : " + music_clone.toString());
    }

}
