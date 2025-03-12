package org.example;

class Main {
    public static void main(String[] args) {
        오리 a오리 = new 오리();
        a오리.날다();

        흰오리 a흰오리 = new 흰오리();
        a흰오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.

       청둥오리 a청둥오리 = new 청둥오리();
        a청둥오리.날다();

        고무오리 a고무오리 = new 고무오리();
        a고무오리.날다();


        고무2오리 a고무2오리 = new 고무2오리();
        a고무2오리.날다();

    }
}

class 오리 {
    void 날다() {//1
        System.out.println("날다");
    }
}
class 흰오리 extends 오리 {//2
//    void 날다(){
//        System.out.println("흰오리가 난다");
//    }
}

class 청둥오리 extends 오리 {
//    void 날다() {
//        System.out.println("오리가 날개로 날아갑니다.");
//    }
}
class 고무오리 extends 오리 {
    void 날다(){ // 오버라이딩 - 부모한테 물려받을거를 내가 재정의 해서 쓸거에요
        System.out.println("고무오리는 못날아요");
    }
}

class 고무2오리 extends 고무오리 {
//    void 날다(){
//        System.out.println("고무오리는 못날아요");
//    }
}