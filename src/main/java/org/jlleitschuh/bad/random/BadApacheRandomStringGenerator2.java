package org.jlleitschuh.bad.random;

import org.apache.commons.text.CharacterPredicates;
import org.apache.commons.text.RandomStringGenerator;

import java.util.Random;

public class BadApacheRandomStringGenerator2 {
    private static Random RANDOM = new Random();
    private static RandomStringGenerator STRING_GENERATOR =
        new RandomStringGenerator.Builder()
            .withinRange('0', 'z')
            .usingRandom(RANDOM::nextInt)
            .filteredBy(CharacterPredicates.LETTERS, CharacterPredicates.DIGITS)
            .build();

    static String doGenerate() {
        return STRING_GENERATOR.generate(30);
    }

    static String generatePassword() {
        return doGenerate();
    }
}
