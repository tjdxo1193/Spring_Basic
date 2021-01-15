package sungtae.basic;

public class HelloSpring4App01 {
    // 첫번째 사례
    // 간단한 인사말을 출력하는 프로그램 작성
    // 메세지를 출력하는 sayHello메서드를 만들어 호출
    // 단, sayHello메서드를 호출하려면 먼저, HelloSpringApp01에 대한 객체를 생성해야됨

    // 인사말을 출력하는 메서드가 현재 클래스에 있기 때문에
    // 프로그램의 확장성 측면에서 봤을때 제약이 존재
    // 즉, 유지보수 및 업무분담의 어려움이 발생
    // 해결책 : 인사말 출력 기능을 담당하는 별도의 클래스를 작성

    public static void main(String[] args) {
        HelloSpring4App01 app = new HelloSpring4App01();
        app.sayHello("World!");
    }

    private void sayHello(String msg){
        System.out.println("Hello, " + msg);
    }
}
