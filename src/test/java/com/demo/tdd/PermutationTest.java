package com.demo.tdd;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

public class PermutationTest {
    @Test
    public void should_return_ab_ba_when_input_ab() {
        // given
        String input = "ab";
        Permutation permutation = new Permutation();
        // when
        List<String> result = permutation.cal(input);
        // then
        assertThat(Arrays.asList("ab", "ba"), is(result));
    }

    @Test
    public void should_return_a_when_input_a() {
        // given
        String input = "a";
        Permutation permutation = new Permutation();
        // when
        List<String> result = permutation.cal(input);
        // then
        assertThat(Arrays.asList(input), is(result));
    }

    @Test
    public void should_return_abc_acb_bac_bca_cab_cba_when_input_abc() {
        // given
        String input = "abc";
        Permutation permutation = new Permutation();
        // when
        List<String> result = permutation.cal(input);
        // then
        assertThat(Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba"), is(result));
    }

    @Test
    public void should_get_size_of_24_when_input_abcd() {
        // given
        String input = "abcd";
        Permutation permutation = new Permutation();

        // when
        List<String> result = permutation.cal(input);
        // then
        assertThat(24, is(result.size()));
    }

    @Test
    public void should_throw_exception_when_given_null() {
        // given
        String input = "";
        Permutation permutation = new Permutation();
        // when
        try {
            permutation.cal(input);
            fail("should throw exception");
        } catch (Exception e) {
        }
        // then
        ;
    }
}
