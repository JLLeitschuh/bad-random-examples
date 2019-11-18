package org.jlleitschuh.bad.random;

import org.apache.commons.lang.RandomStringUtils;

public class BadApacheRandomStringUtils {
    static String generate() {
        return RandomStringUtils.randomAscii(30);
    }

    static String generatePassword() {
        return generate();
    }
}
