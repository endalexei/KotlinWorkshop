package exercises.day2.java;

import java.util.List;

public class ListOfString {

    List<String> lsit;

    public List<String> getLsit() {
        return lsit;
    }

    public void setLsit(List<String> lsit) {
        this.lsit = lsit;
    }

    @Override
    public String toString() {
        StringBuilder reslut = new StringBuilder();
        lsit.forEach(reslut::append);
        return reslut.toString();
    }

}
