package composite;

public class Client {

    public static void main(String[] args) {

        File file1 = new File("_3015", 15);
        File file2 = new File("_10798", 27);
        File file3 = new File("_1089", 53);
        Directory dir1 = new Directory("baekjoon");
        dir1.add(file1);
        dir1.add(file2);
        dir1.add(file3);

        Directory dir2 = new Directory("designPattern");
        File composite = new File("composite", 30);
        File proxy = new File("proxy", 40);
        File templateMethod = new File("templateMethod", 55);
        dir2.add(composite);
        dir2.add(proxy);
        dir2.add(templateMethod);

        Directory rootDir = new Directory("root");
        rootDir.add(dir1);
        rootDir.add(dir2);
        rootDir.add(new File("read.me", 10));

//        System.out.println("rootDir size : " + rootDir.getSize());
//        System.out.println("rootDir name : " + rootDir.getName());
//        rootDir.info();

        rootDir.rename("루트 디렉토리");
        System.out.println(rootDir.getName());
        file1.rename("삼공일오");
        System.out.println(file1.getName());
        dir1.info();
    }

}
