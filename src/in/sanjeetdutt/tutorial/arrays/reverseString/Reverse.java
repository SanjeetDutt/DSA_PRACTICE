package in.sanjeetdutt.tutorial.arrays.reverseString;

import java.nio.charset.StandardCharsets;

public class Reverse {

    public String reverse(String str){
        if(str == null)
            return null;

        return reverse(str.split(""),str.length()-1);
    }

    private String reverse(String[] str, int index){
        if(index == 0)
            return str[index];

        return str[index] + reverse(str, index-1);
    }


}
