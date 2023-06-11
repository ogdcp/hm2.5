package pro.sky.java.course2.demo1;

import java.util.List;

public interface EmployeeService {

    Employee addPerson(String name, String lastName);

    Employee deletePerson(String name, String lastName);

    Employee searchPerson(String name, String lastName);

    List<Employee> showAllPersons();
}
