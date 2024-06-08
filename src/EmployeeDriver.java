import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeDriver {
    public static void main(String[] args) {
        List<Employee> employeeList =new ArrayList<>();

        List<Integer>  list1= Arrays.asList(2,10,9,13,12,19,19);

        employeeList.add(new Employee(1,1000));
        employeeList.add(new Employee(2,1500));

        employeeList.add(new Employee(3,700));
        employeeList.add(new Employee(4,3000));
        employeeList.add(new Employee(5,2500));
        employeeList.add(new Employee(6,1700));

//        List<Employee> sortedList=employeeList.stream().
//                sorted((o1,o2)->(int)(o1.getSalary()-o2.getSalary())).
//                collect(Collectors.toList());

       List<Integer> list= list1.stream().filter(x->x%2==0 && x>5).collect(Collectors.toList());


        System.out.println(list);
    }
}
