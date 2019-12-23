package org.jlleitschuh.bad.random;

import org.apache.commons.text.CharacterPredicates;
import org.apache.commons.text.RandomStringGenerator;

import java.security.SecureRandom;

public class GoodApacheRandomStringGenerator {
    private static SecureRandom RANDOM = new SecureRandom();
    private static RandomStringGenerator STRING_GENERATOR =
        new RandomStringGenerator.Builder()
            .withinRange('0', 'z')
            .usingRandom(RANDOM::nextInt)
            .filteredBy(CharacterPredicates.LETTERS, CharacterPredicates.DIGITS)
            .build();

    static String generate() {
        return STRING_GENERATOR.generate(30);
    }

    static String generatePassword() {
        return generate();
    }
}
