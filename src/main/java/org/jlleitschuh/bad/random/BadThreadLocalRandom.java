package org.jlleitschuh.bad.random;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

/**
 * This is the exact vulnerability found in Ratpack.
 * <p/>
 * <a href="https://nvd.nist.gov/vuln/detail/CVE-2019-11808">CVE-2019-11808</a>
 * <a href="https://github.com/ratpack/ratpack/commit/f2b63eb82dd71194319fd3945f5edf29b8f3a42d">Fix commit</a>
 */
public class BadThreadLocalRandom {
    static UUID generate() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        return new UUID(random.nextLong(), random.nextLong());
    }

    static UUID generatePassword() {
        return generate();
    }
}
