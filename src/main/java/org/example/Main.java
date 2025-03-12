package org.example;

class Main {
    public static void main(String[] args) {
        double d = 1;
        System.out.println(d);

        무기 a무기 = new 칼();
        a무기.공격();
    }
}

//abstract class 무기 { // abstrcat는 오버라이딩 필수
//    abstract void 공격(); // 칼에서 어쩌피 재정의 해서 void공격 메서드 body는 아무거나 있어도 상관없음
//    // 그래서 빈칸으러 놔도 됨. 구현 하지마! 그래서 여기에 쓰지말라고 abstract을붙임 대신에 부모 클래스에도 abstract을 붙임 그리고 공격 메서드는 무조건 오버라이드 해야됨.
//
//}
//
//class 칼 extends 무기 {
//    void 공격() {
//        System.out.println("칼 공격");
//    }
//}

interface 무기 { // 순도 100퍼센트 추상클래스일대 interface임
     void 공격();
     void 방어();

}

class 칼 implements 무기 { //그럼 extends를 implements로 변환 extends는 다중구현 처럼 보이는 무언가가 가능
   public void 공격() {// 메소드에는 public 붙이고
        System.out.println("칼 공격");
    }
   public void 방어() {
        System.out.println("칼방어");
    }
}

// 무기 a무기 = new 칼();
// a무기라는 변수는 나중에 무기 클래스로 만든 객체랑 연결할거야(a무기 변수에는 무기 리모컨이 들어갈거야)
// new 칼()-> 칼 인스턴스생성 =< 칼 리모컨 생성

