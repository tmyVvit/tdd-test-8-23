package com.demo.tdd;

import org.junit.jupiter.api.Test;

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
        assertThat(input, is(result));
    }
}
