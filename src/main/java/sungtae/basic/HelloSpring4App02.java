package sungtae.basic;


import sungtae.bean.HelloSpring4Bean02;

public class HelloSpring4App02 {
    // 두번째 사례
    // 외부 클래스를 통해 인사말을 출력하는 기능 구현
    // 인사말을 출력하려면 외부 클래스를 객체화한 뒤
    // sayHello 메서드 호출

    // 한편, HelloSpring4App02을 실행하려면
    // HelloSpring4App02라는 클래스가 있어야 함
    // 즉, 클래스 간의 의존성이 생김
    // 의존성이 커짐으로써 발생하는 부수적인 단점은
    // 코드변경시 그것과 연관되는 다른 클래스에도 영향을 미침

    // 해결: 인터페이스를 도입해서 객체간의 의존성을 낮춤
    public static void main(String[] args) {
        HelloSpring4Bean02 bean = new HelloSpring4Bean02();
        bean.sayHello("World!");
    }
}
