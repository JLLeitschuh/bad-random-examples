package org.jlleitschuh.bad.random;

import java.util.Random;

/**
 * Example from
 * <a href="https://stackoverflow.com/a/5683362/3708426">Stack Overflow</a>
 *
 */
public class BadRandom3 {
    private static final Random RANDOM = new Random();
    private static final char[] CHARS = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    static String generate() {
        StringBuilder builder = new StringBuilder(30);
        for (int i = 0; i < 30; i++) {
            char c = CHARS[RANDOM.nextInt(CHARS.length)];
            builder.append(c);
        }
        return builder.toString();
    }

    static String generatePassword() {
        return generate();
    }
}
