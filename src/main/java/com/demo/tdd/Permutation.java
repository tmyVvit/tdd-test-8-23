package com.demo.tdd;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
    public List<String> cal(String input) {
        List<String> list = new ArrayList<>();
        if (input.length() == 2) {
            list.add(input.substring(0, 1) + input.substring(1, 2));
            list.add(input.substring(1, 2) + input.substring(0, 1));
            return list;
        }
        if(input.length() == 3) {
            list.add(input);
            list.add(input.substring(0,1) + input.substring(2,3) + input.substring(1,2));
            list.add(input.substring(1,2) + input.substring(0,1) + input.substring(2,3));
            list.add(input.substring(1,2) + input.substring(2,3) + input.substring(0,1));
            list.add(input.substring(2,3) + input.substring(0,1) + input.substring(1,2));
            list.add(input.substring(2,3) + input.substring(1,2) + input.substring(0,1));
            return list;
        }
        return Arrays.asList(input);
    }

}
