package org.jlleitschuh.bad.random;

import java.nio.charset.Charset;
import java.util.Random;

public class BadRandom {
    private static final Random RANDOM = new Random();

    static String generate() {
        byte[] array = new byte[30];
        RANDOM.nextBytes(array);
        return new String(array, Charset.defaultCharset());
    }

    static String generatePassword() {
        return generate();
    }
}
