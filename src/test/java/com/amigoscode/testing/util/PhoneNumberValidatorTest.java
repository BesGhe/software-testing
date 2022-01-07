package com.amigoscode.testing.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PhoneNumberValidatorTest {

    private PhoneNumberValidator underTest;

    @BeforeEach
    void  setUp(){
        underTest = new PhoneNumberValidator();
    }

    @ParameterizedTest
    @CsvSource({"13021234567, TRUE",
            "1302123456789, false",
            "2222123456789, FAlsE"})
    void itShouldValidatePhoneNumber(String phoneNumber, Boolean expected){
        //When
        boolean isValid = underTest.test(phoneNumber);
        //Then
        assertThat(isValid).isEqualTo(expected);
    }
}
