package org.jlleitschuh.bad.random;

import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Random;

public class GoodRandom2 {
    /**
     * Example of type loss.
     */
    public final Random random;

    private GoodRandom2() {
        random = new SecureRandom();
    }

    String generate() {
        byte[] array = new byte[30];
        random.nextBytes(array);
        return new String(array, Charset.defaultCharset());
    }

    String generatePassword() {
        return generate();
    }

    static GoodRandom2 getInstance() {
        return new GoodRandom2();
    }
}
