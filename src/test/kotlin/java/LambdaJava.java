package java;

import java.util.List;

class LambdaJava {

    public List<String> textToLowercase(List<String> value) {
        value.replaceAll(str -> {
            if (str != null) {
                str.toLowerCase();
            }
            return str;
        });
        return value;
    }

}