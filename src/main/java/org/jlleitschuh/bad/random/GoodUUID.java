package org.jlleitschuh.bad.random;

import java.util.UUID;

public class GoodUUID {
    static UUID generate() {
        return UUID.randomUUID();
    }

    static UUID generatePassword() {
        return generate();
    }
}
