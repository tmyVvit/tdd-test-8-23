package com.demo.tdd;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PermutationTest {
    @Test
    public void should_return_a_when_input_a(){
    // given
        String input = "a";
        Permutation permutation = new Permutation();
    // when
        List<String> result = permutation.cal(input);
    // then
        assertThat(Arrays.asList(input), is(result));
    }

    @Test
    public void should_return_ab_ba_when_input_ab(){
    // given
        String input = "ab";
        Permutation permutation = new Permutation();
    // when
        List<String> result = permutation.cal(input);
    // then
        assertThat(Arrays.asList("ab","ba"), is(result));
    }
}
