package com.bitwise.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegiStrationTest {
    private UserRegistration uc;

    @Before
    public void setUp() throws Exception {
        uc = new UserRegistration();
    }

    @Test
    public void givenPassword_WhenProperFormat_ShouldReturnTrue() {
        boolean isValid = uc.isValidPassword("devika@18");
        Assert.assertTrue(isValid);
        System.out.println("Password is Valid");
        System.out.println(isValid);
    }
}
