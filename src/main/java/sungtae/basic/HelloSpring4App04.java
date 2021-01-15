package sungtae.basic;

import sungtae.bean.HelloSpring4Bean04;
import sungtae.bean.HelloSpring4Bean04Eng;
import sungtae.bean.HelloSpring4Bean04Jpn;
import sungtae.bean.HelloSpring4Bean04Kor;

public class HelloSpring4App04 {
    // 네번째 사례
    // 인사말을 한국어, 영어, 일본어로 출력하도록 기능 개선
    // 인터페이스를 도입

    // 확장성이 높고 유연한 코드를 작성할 수 있음
    // 또한, 객체간의 tightly coupled도 피할 수 있음
    // 객체간의 의존성도 낮출 수 있음

    // 하지만, new 연산자로 객체를 생성하는 코드가 노출
    // 다시말해, HelloSpring4Bean04은
    // HelloSpring4Bean04Kor, HelloSpring4Bean04Eng, HelloSpring4Bean04Jpn
    // 이 세가지에 의존적이라는 의미임

    // 해결: factory 패턴을 이용해서
    // 객체생성을 전담하는 클래스를 만들어 객체생성과정을 캡슐화함

    public static void main(String[] args) {

        HelloSpring4Bean04 bean = new HelloSpring4Bean04Kor();
        bean.sayHello("스프링4");

        bean = new HelloSpring4Bean04Eng();
        bean.sayHello("Spring4");

        bean = new HelloSpring4Bean04Jpn();
        bean.sayHello("スプリング4");

        // tightly coupled
//        HelloSpring4Bean04Kor bean1 = new HelloSpring4Bean04Kor();
//        bean1.sayHello("스프링4");
//
//        HelloSpring4Bean04Eng bean2 = new HelloSpring4Bean04Eng();
//        bean2.sayHello("Spring4");
//
//        HelloSpring4Bean04Jpn bean3 = new HelloSpring4Bean04Jpn();
//        bean3.sayHello("スプリング4");
    }
}
