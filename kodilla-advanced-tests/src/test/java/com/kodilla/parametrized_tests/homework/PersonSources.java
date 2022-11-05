package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {
    static Stream<Arguments> providePersonForTestingBMI() {
        return Stream.of(
                Arguments.of(new Person(1.55, 47), "Normal (healthy weight)"),
                Arguments.of(new Person(1.60, 49), "Normal (healthy weight)"),
                Arguments.of(new Person(1.65, 50), "Underweight"),
                Arguments.of(new Person(1.75, 65), "Normal (healthy weight)"),
                Arguments.of(new Person(1.80, 72), "Normal (healthy weight)"),
                Arguments.of(new Person(1.90, 130), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.75, 130), "Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.80, 100), "Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.55, 30), "Very severely underweight"),
                Arguments.of(new Person(1.60, 30), "Very severely underweight"),
                Arguments.of(new Person(1.75, 80), "Overweight"),
                Arguments.of(new Person(1.80, 180), "Obese Class V (Super Obese)"),
                Arguments.of(new Person(1.90, 50), "Very severely underweight"),
                Arguments.of(new Person(1.75, 200), "Obese Class VI (Hyper Obese)"),
                Arguments.of(new Person(1.80, 150), "Obese Class IV (Morbidly Obese)"),
                Arguments.of(new Person(1.60, 120), "Obese Class IV (Morbidly Obese)"),
                Arguments.of(new Person(1.55, 38), "Severely underweight")
        );
    }
}
