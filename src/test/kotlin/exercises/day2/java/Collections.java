package exercises.day2.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collections {

    public void printByList(List<String> list) {
        System.out.println("Number of elements: " + list.size());
        System.out.println("Third element: " + list.get(3));
        System.out.println("Fourth element: " + list.get(4));
        System.out.println("Index of element \"two\" " + list.indexOf("two"));
    }

    public List<String> getShortWordsTo(List<String> list, int max) {
        List<String> toRemove = Arrays.asList("a", "A", "an", "An", "the", "The");
        List<String> sorted = list.stream().filter(l -> l.length() <= max).collect(Collectors.toList());
        sorted.removeAll(toRemove);
        return sorted;
    }

    public List<Integer> increaseList(List<Integer> list) {
        ListIterator<Integer> listiterator = list.listIterator();
        listiterator.add(1);
        listiterator.next();
        listiterator.next();
        listiterator.set(3);
        listiterator.add(4);
        list.add(6);
        return list;
    }

    public List<Integer> makeIntList(Integer number) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= number; i = i + 3) {
            result.add(i);
        }
        return result;
    }

    public List<Integer> combineWith(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> list3 = new ArrayList<>(list1);
        list3.retainAll(list2);
        return list3;
    }

    public List<Integer> uniteWith(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Stream<Integer> reslut = Stream.concat(list1.stream(), list2.stream());
        return reslut.toList();
    }
}
