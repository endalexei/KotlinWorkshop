package Java;

public class NullSafety {

    public int getLength(String value) {
        if (value != null) {
            return value.length();
        } else {
            return 0;
        }
    }
}
