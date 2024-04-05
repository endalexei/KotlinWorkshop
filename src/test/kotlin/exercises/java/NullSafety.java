package exercises.java;

import exercises.java.clases.Company;
import exercises.java.clases.Employ;
import exercises.java.clases.Endava;

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
        Employ employ = company.getEndava().getEmploy();
        if (employ != null) {
            return employ.getName();
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

    public Employ safeCastToEmploy(Object value) {
        if (value instanceof Employ) {
            return (Employ) value;
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
