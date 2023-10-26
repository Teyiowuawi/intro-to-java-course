package com.cbfacademy;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.junit.jupiter.params.provider.Arguments.arguments;


@DisplayName("Should return a number, Fizz, Buzz or FizzBuzz")
public class FizzBuzzTests {
    
    static Stream<Arguments> numbersToTest(){
        return Stream.of(
            arguments(1, "1"),
            arguments(2, "2"),
            arguments(3, "Fizz"),
            arguments(4, "4"),
            arguments(5, "Buzz"),
            arguments(6, "Fizz"),
            arguments(7, "7"),
            arguments(8, "8"),
            arguments(9, "Fizz"),
            arguments(10, "Buzz"),
            arguments(11, "11"),
            arguments(12, "Fizz"),
            arguments(13, "13"),
            arguments(14, "14"),
            arguments(15, "FizzBuzz")


        );
    }

    @ParameterizedTest
    @MethodSource("numbersToTest")
    @DisplayName("return expected value")
    public void returnExpectedValue(Integer number, String expected){
        final String actual = FizzBuzz.of(number);
        assertThat(actual, is(expected));
    }


}

