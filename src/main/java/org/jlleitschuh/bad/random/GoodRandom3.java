package org.jlleitschuh.bad.random;

import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Random;

public class GoodRandom3 {
    private GoodRandom3() { }

    String generate() {
        Random random = new SecureRandom();
        byte[] array = new byte[30];
        random.nextBytes(array);
        return new String(array, Charset.defaultCharset());
    }

    String generatePassword() {
        return generate();
    }

    static GoodRandom3 getInstance() {
        return new GoodRandom3();
    }
}
