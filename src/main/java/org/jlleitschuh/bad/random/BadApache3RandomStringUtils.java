package org.jlleitschuh.bad.random;

import org.apache.commons.lang3.RandomStringUtils;

public class BadApache3RandomStringUtils {
    static String generate() {
        return RandomStringUtils.randomAscii(30);
    }

    static String generatePassword() {
        return generate();
    }
}
