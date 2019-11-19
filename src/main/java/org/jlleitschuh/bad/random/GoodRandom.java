package org.jlleitschuh.bad.random;

import java.nio.charset.Charset;
import java.security.SecureRandom;

public class GoodRandom {
    private static final SecureRandom SECURE_RANDOM = new SecureRandom();

    static String generate() {
        byte[] array = new byte[30];
        SECURE_RANDOM.nextBytes(array);
        return new String(array, Charset.defaultCharset());
    }

    static String generatePassword() {
        return generate();
    }
}
