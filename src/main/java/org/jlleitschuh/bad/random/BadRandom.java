package org.jlleitschuh.bad.random;

import java.nio.charset.Charset;
import java.util.Random;

public class BadRandom {
    static String generate() {
        byte[] array = new byte[30];
        new Random().nextBytes(array);
        return new String(array, Charset.defaultCharset());
    }

    static String generatePassword() {
        return generate();
    }
}
