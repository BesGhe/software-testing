package com.amigoscode.testing.util;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
public class PhoneNumberValidator implements Predicate<String> {
//    public boolean validate(String phoneNumber) {
//    } - changed name to test

    @Override
    public boolean test(String phoneNumber) {
        return phoneNumber.startsWith("1302") && phoneNumber.length()==11;

    }
}
