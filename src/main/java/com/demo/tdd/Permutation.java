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
        if(input.length()>3){
            for(int i = 0; i < input.length(); i++){
                String sub = input.substring(0, i) + input.substring(i+1);
                List<String> res = cal(sub);
                for(String str : res){
                    list.add(input.charAt(i)+str);
                }

            }
            return list;
        }
        return Arrays.asList(input);
    }

}
