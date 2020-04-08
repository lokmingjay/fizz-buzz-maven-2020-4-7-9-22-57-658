package com.oocl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {
    @Test
    public void should_return_number_when_input_normal_number() {
        //give
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.play(2);
        //then
        assertEquals("2",result);
    }
}
