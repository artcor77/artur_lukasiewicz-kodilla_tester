package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {
    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidNumbers.csv", numLinesToSkip = 1)
    public void shouldGamblingMachineWorks_withException(String numbers) {
        String[] arrayNumbers = numbers.split(",");
        Set<String> setNumbers = new HashSet<>(Arrays.asList(arrayNumbers));
        Set<Integer> expected = setNumbers
                .stream()
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(expected));
    }

}