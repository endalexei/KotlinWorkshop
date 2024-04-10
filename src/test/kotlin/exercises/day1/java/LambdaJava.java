package exercises.day1.java;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class LambdaJava {

    @FunctionalInterface
    interface MyFunction {
        int apply(int x, int y);
    }

    MyFunction sum = (x, y) -> x + y;

    public int sum(int a, int b) {
        return sum.apply(2, 3);
    }

    public void increase(int a) {
        //java has no solution for function literals with receiver on a object
        Action action = new Action();
        action.setA(5);
        action.sum(a);
    }

    public int sumListElements(List<Integer> list) {
        int sum = list.stream()
                .reduce(0, Integer::sum);
        return sum;
    }

    public List<Integer> filterPositiveNumbers(List<Integer> list) {
        return list.stream()
                .filter(item -> item > 0)
                .collect(Collectors.toList());
    }

    public String getValueFromMap(Map<String,String>map){
        return map.values().stream().reduce("", String::concat);

    }

}

class Action {
    int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int sum(int value) {
        return this.a + value;
    }
}