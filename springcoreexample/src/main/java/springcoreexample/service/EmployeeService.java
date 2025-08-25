package springcoreexample.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
static List<Employee> emplist;

static {
	emplist =Arrays.asList(new Employee(322,"abc",123),new Employee(232,"abcd",232) );
	
}

public List<Employee> getEmployeeList(){
	return emplist;
	}






}
