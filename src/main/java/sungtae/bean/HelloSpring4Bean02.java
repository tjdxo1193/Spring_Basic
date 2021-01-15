package sungtae.bean;

public class HelloSpring4Bean02 {

    // 인사말을 출력하는 메서드
    public void sayHello(String msg){

        // 만일 메서드의 서명을 다음과 같이 바꾼다면?
//    public void sayHello(String msg, String title){
        System.out.println("Hello, " + msg);
    }
}
