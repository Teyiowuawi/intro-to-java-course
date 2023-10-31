package com.cbfacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;

@DisplayName("Returns false if year isn't a leap year and true if it is a leap year")
public class LeapYearTest {

    static Stream<Arguments> yearsToTest(){
        return Stream.of(
            arguments(1700, false),
            arguments(1800, false),
            arguments(1900, false),
            arguments(2000, true),
            arguments(2001, false),
            arguments(2002, false),
            arguments(2003, false),
            arguments(2004, true),
            arguments(2005, false),
            arguments(2006, false),
            arguments(2007, false),
            arguments(2008, true),
            arguments(2009, false),
            arguments(2010, false),
            arguments(2011, false)

            

        );
    }


@ParameterizedTest
@MethodSource("yearsToTest")
@DisplayName("return true or false")
public void returnTrueOrFalse(int year, Boolean trueOrFalse){
    final Boolean actual = LeapYear.isLeapYear(year);
    assertThat(actual, is(trueOrFalse));
}



}
