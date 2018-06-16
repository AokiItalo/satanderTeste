package com.italo.satandertest;

import com.italo.satandertest.util.StringUtils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;


@RunWith(RobolectricTestRunner.class)
public class EmailTest {


    private final String VALID_EMAIL = "italoaoki@gmail.com";
    private final String INVALID_EMAIL = "italo";


    @Test
    public void test_validEmail() {
        boolean validEmail = StringUtils.isValidEmail(VALID_EMAIL);
        assertTrue(validEmail);
    }

    @Test
    public void test_invalidEmail() {
        boolean validEmail = StringUtils.isValidEmail(INVALID_EMAIL);
        assertFalse(validEmail);
    }

}
