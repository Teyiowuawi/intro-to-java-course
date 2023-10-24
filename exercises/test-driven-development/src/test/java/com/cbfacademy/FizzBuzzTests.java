package com.cbfacademy;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.params.provider.Arguments.arguments;


@DisplayName("Should return a number, Fizz, Buzz or FizzBuzz")
public class FizzBuzzTests {
    
    static Stream<Arguments> numberToTest(){
        return Stream.of(
            arguments(1, "1"),
            arguments(2, "2"),
            arguments(3, "Fizz")
        );
    }

    @ParameterizedTest

}
