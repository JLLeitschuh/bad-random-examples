package org.jlleitschuh.bad.random;

import org.apache.commons.lang3.RandomStringUtils;

import java.security.SecureRandom;

public class GoodApache3RandomStringUtils {
    private static final SecureRandom SECURE_RANDOM = new SecureRandom();

    static String generate() {
        return RandomStringUtils.random(
            30,
            32,
            127,
            false,
            false,
            null,
            SECURE_RANDOM
        );
    }

    static String generatePassword() {
        return generate();
    }
}
