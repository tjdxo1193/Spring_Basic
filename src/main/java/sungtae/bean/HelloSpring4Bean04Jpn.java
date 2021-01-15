package sungtae.bean;

public class HelloSpring4Bean04Jpn implements HelloSpring4Bean04{

    @Override
    public void sayHello(String msg){
        System.out.println("こんにちは, " + msg);
    }

}
