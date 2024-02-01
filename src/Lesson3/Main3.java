package Lesson3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main3{
        public static void main(String[] args) {
        Employee employee1 = new Employee("Иванов", 24, 250.00);
        Employee employee2 = new Employee("Синьков", 31, 50.00);
        Employee employee3 = new Employee("Баженов", 21, 150.00);
        Employee employee4 = new Employee("Орешкин", 18, 100.00);
        Employee employee5 = new Employee("Павлов", 40,1000000.00);

        Set<Employee> employeesIter = new TreeSet<>();
        employeesIter.add(employee1);
        employeesIter.add(employee2);
        employeesIter.add(employee3);
        employeesIter.add(employee4);
        employeesIter.add(employee5);
        Company companyOne = new Company("Company One", employeesIter);
        System.out.println(companyOne);

        Set<Employee> employeesSalaryComparator = new TreeSet<>(
                (employeeFirst, employeeSecond) -> (int) (employeeFirst.getSalary() - employeeSecond.getSalary()));
        employeesSalaryComparator.add(employee1);
        employeesSalaryComparator.add(employee2);
        employeesSalaryComparator.add(employee3);
        employeesSalaryComparator.add(employee4);
        employeesSalaryComparator.add(employee5);
        Company companyTwo = new Company("Company Two", employeesSalaryComparator);
        System.out.println(companyTwo);

        Set<Employee> employeesSalaryReversedComparator = new TreeSet<>(Comparator.comparing(Employee::getSalary).reversed());
        employeesSalaryReversedComparator.add(employee1);
        employeesSalaryReversedComparator.add(employee2);
        employeesSalaryReversedComparator.add(employee3);
        employeesSalaryReversedComparator.add(employee4);
        employeesSalaryReversedComparator.add(employee5);
        Company companyThree = new Company("Company Three", employeesSalaryReversedComparator);
        System.out.println(companyThree);

        Iterator<Employee> iterator = companyThree.iterator();

        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}

