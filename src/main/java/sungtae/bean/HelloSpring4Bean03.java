package sungtae.bean;

public class HelloSpring4Bean03 {

    // 다양한 언어로 인사말을 출력하는 메서드
    public void sayHelloKor(String msg){
        System.out.println("안녕하세요, " + msg);
    }

    public void sayHelloEng(String msg){
        System.out.println("Hello, " + msg);
    }

    public void sayHelloJpn(String msg){
        System.out.println("こんにちは, " + msg);
    }
}
