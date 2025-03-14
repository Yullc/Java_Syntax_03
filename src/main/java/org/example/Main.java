package org.example;

public class Main {
    public static void main(String[] args) {
//        int[] arr = new int [3];
//        Article article = new Article[3];
//        int lastId=0;
//
//        Article article1 = new Article();
//        lastId++;
//        article1.id = lastId;
//        System.out.println(article1.id);
//
//        Article article2 = new Article();
//        lastId++;
//        article2.id = lastId;
//        System.out.println(article1.id);
//
//        Article article3 = new Article();
//        lastId++;
//        article3.id = lastId;
//        System.out.println(article1.id);
//    }
        int lastId=0;

        Article article1 = new Article();

        System.out.println(article1.id);

        Article article2 = new Article();

        System.out.println(article2.id);

    }
}
class Article{
    int id;
    String regData;

    static int lastId; // 클래스에 속한 클래스 변수 - 모든 인스턴스 공유, 객체 생성과 무관

    static { // static 전용 생성자
        lastId=0;
    }

    Article(){
        this(lastId+1,"2025-12-12 12:12:12");// 이건 꼭 생성자 바디 첫줄에 있어야 함 // 다른 생성자 호출 실행!
        // 생성자 안에서 다른 생성자 호출 가능
        lastId++;
        //this.id =1;
    }
    

    Article(int id, String regData){
        this.id = id;
        this.regData = regData;
    }
}