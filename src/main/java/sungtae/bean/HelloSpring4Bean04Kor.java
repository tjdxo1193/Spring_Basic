package sungtae.bean;

public class HelloSpring4Bean04Kor implements HelloSpring4Bean04 {

    @Override
    public void sayHello(String msg){
        System.out.println("안녕하세요, " + msg);
    }
}
