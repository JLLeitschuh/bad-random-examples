package org.jlleitschuh.bad.random;

import org.apache.commons.lang3.RandomStringUtils;

import java.security.SecureRandom;
import java.util.Random;

public class GoodApacheRandomStringUtils2 {
    private static final Random RANDOM = new SecureRandom();

    static String generate() {
        return RandomStringUtils.random(
            30,
            32,
            127,
            false,
            false,
            null,
            RANDOM
        );
    }

    static String generatePassword() {
        return generate();
    }
}
