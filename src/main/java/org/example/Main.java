package org.example;


class Main {
    public static void main(String[] args) {
        사람 a =new 사람();
        a.age =23;
        a.name ="김철수";
        a.isMarried=true;
        a.introduce();

        사람 b =new 사람();
        b.age=24;
        b.name="박영수";
        b.isMarried = true;
        b.introduce();
    }
}
class 사람{
    int age;
    String name;
    boolean isMarried;

    void introduce(){
        System.out.println("==자기소개==");
        System.out.println("나이: "+this.age);
        System.out.println("이름: "+this.name);
        System.out.println("결혼여부: " +this.isMarried);

    }

}