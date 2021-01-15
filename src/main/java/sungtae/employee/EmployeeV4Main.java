package sungtae.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class EmployeeV4Main {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("employee.xml");
        EmployeeV4Service epvs = (EmployeeV4ServiceImpl)ctx.getBean("epvs");
//        EmployeeV4Service epvs = new EmployeeV4ServiceImpl();
        Scanner sc = new Scanner(System.in);
        String menu = null;
        while (true) {
            ((EmployeeV4ServiceImpl)epvs).displayMenu();
            menu = sc.nextLine();
            switch (menu){
                case "1": epvs.newEmployee(); break;
                case "2": epvs.readEmployee();break;
                case "3": epvs.readOneEmployee();break;
                case "4": epvs.modifyEmployee();break;
                case "5": epvs.removeEmployee();break;
                case "0": System.exit(0); break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }

        }
    }
}