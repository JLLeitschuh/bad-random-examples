package org.jlleitschuh.bad.random;

import java.util.Random;

public class BadRandom2 {
    private static final Random random = new Random();

    static String generate() {
        return Long.toHexString(random.nextLong());
    }

    static String generatePassword() {
        return generate();
    }
}
