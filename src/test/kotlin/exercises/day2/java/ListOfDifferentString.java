package exercises.day2.java;

import java.util.List;

public class ListOfDifferentString extends ListOfString {
    
    List<String> lsit;

    public List<String> getLsit() {
        return lsit;
    }

    public void setLsit(List<String> lsit) {
        this.lsit = lsit;
    }

    @Override
    public String toString() {

        ListOfString listOfString = new ListOfDifferentString();
        listOfString.setLsit(this.lsit);
        String result = listOfString.toString();
        return result.replace("to", "tow").replace("sree", "three");
    }
}
