package exercises.day1.java;

import exercises.day1.java.clases.Company;
import exercises.day1.java.clases.Employee;
import exercises.day1.java.clases.Endava;

import java.util.ArrayList;
import java.util.List;

public class NullSafety {

    Company company = new Company();

    public int getLength(String value) {
        if (value != null) {
            return value.length();
        } else {
            return 0;
        }
    }

    public String getEmployName() {
        Employee employee = company.getEndava().getEmploy();
        if (employee != null) {
            return employee.getName();
        }
        return "null";
    }

    public Object getEmployAge() {
        Endava employ = company.getEndava();
        if (employ.getEmploy() != null) {
            return employ.getEmploy().getAge();
        }
        return null;
    }

    public int getLengthOrZero(String value) {
        if (value != null) {
            return value.length();
        }
        return 0;
    }

    public int getLengthOrException(String value) {
        if (value != null) {
            return value.length();
        } else {
            throw new NullPointerException();
        }
    }

    public Employee safeCastToEmploy(Object value) {
        if (value instanceof Employee) {
            return (Employee) value;
        }
        return null;
    }

    public List<Integer> removeNull(List<Integer> value) {
        List<Integer> result = new ArrayList<>();
        value.forEach(v -> {
            if (v != null) {
                result.add(v);
            }
        });
        return result;
    }
}
