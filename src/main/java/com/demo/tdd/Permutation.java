package com.demo.tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
    public List<String> cal(String input) {
        List<String> list = new ArrayList<>();
        if(input.length()==0){
            throw new RuntimeException();
        }
        if(input.length() == 1){
            return Arrays.asList(input);
        }
        for(int i = 0; i < input.length(); i++){
            String sub = removeIndex(input, i);
            List<String> res = cal(sub);
            for(String str : res){
                list.add(input.charAt(i)+str);
            }
        }
        return list;

    }

    private String removeIndex(String input, int index){
        return input.substring(0, index) + input.substring(index+1);
    }
}
