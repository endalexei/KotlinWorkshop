package exercises.day3.java;

public class Endava {
    private String name;
    private Integer age;
    private String workStatus = null;

    public Endava(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus;
    }

    @Override
    public String toString() {
        return "Endava{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
