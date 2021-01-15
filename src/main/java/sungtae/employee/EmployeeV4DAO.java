package sungtae.employee;
import java.util.ArrayList;

public interface EmployeeV4DAO {

    String insertEmployee(EmployeeVO em);
    ArrayList<EmployeeVO> selectEmployee();

    EmployeeVO selectOneEmployee(int empno);

    String updateEmployee(EmployeeVO em);

    String deleteEmployee(int empno);
}