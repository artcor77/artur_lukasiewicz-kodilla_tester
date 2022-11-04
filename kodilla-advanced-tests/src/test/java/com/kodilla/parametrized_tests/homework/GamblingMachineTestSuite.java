package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {
    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidNumbers.csv")
    public void shouldThrowExceptionWhenNumbersAreInvalid(String numbers) {
        String[] arrayNumbers = numbers.split(",");  //Tablica string(csv). Znak(kolumna) oddzielony przecinkiem.
        Set<String> setNumbers = new HashSet<>(Arrays.asList(arrayNumbers));  //Set z tablicy string (elementy się nie powtarzają)
        Set<Integer> expected = setNumbers  //Nowy expected set. Zamieniam string na int.
                .stream()
                .map(Integer::parseInt).collect(Collectors.toSet());
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(expected));
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/validateNumbers.csv")
    public void shouldNotThrowExceptionWhenNumbersAreValidate(String numbers) throws InvalidNumbersException {
        String[] arrayNumbers = numbers.split(",");
        Set<String> setNumbers = new HashSet<>(Arrays.asList(arrayNumbers));
        Set<Integer> expected = setNumbers
                .stream()
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
        int count = gamblingMachine.howManyWins(expected);
        boolean expectedNumbers = count > 0 && count <6;
        if (count<1)
            return;
        assertTrue(expectedNumbers);
        assertEquals(6, expected.size());
    }
}