package org.jlleitschuh.bad.random;

import org.apache.commons.text.CharacterPredicates;
import org.apache.commons.text.RandomStringGenerator;

import java.security.SecureRandom;

public class GoodApacheRandomStringGenerator2 {
    private static SecureRandom RANDOM = new SecureRandom();
    private static RandomStringGenerator STRING_GENERATOR =
        new RandomStringGenerator.Builder()
            .withinRange('0', 'z')
            .usingRandom(i -> RANDOM.nextInt(i))
            .filteredBy(CharacterPredicates.LETTERS, CharacterPredicates.DIGITS)
            .build();

    static String doGenerate() {
        return STRING_GENERATOR.generate(30);
    }

    static String generatePassword() {
        return doGenerate();
    }
}
