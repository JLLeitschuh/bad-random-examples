package org.jlleitschuh.bad.random;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class BadThreadLocalRandom {
    static UUID generate() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        return new UUID(random.nextLong(), random.nextLong());
    }

    static UUID generatePassword() {
        return generate();
    }
}
