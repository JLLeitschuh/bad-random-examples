package org.jlleitschuh.bad.random.jhipster;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * Class generated by JHipster prior to 6.2.0
 * <a href="https://github.com/jhipster/generator-jhipster/security/advisories/GHSA-mwp6-j9wf-968c">CVE-2019-16303</a>
 */
public final class RandomUtil {

    private static final int DEF_COUNT = 20;

    private RandomUtil() {
    }

    /**
     * Generate a password.
     *
     * @return the generated password.
     */
    public static String generatePassword() {
        return RandomStringUtils.randomAlphanumeric(DEF_COUNT);
    }

    /**
     * Generate an activation key.
     *
     * @return the generated activation key.
     */
    public static String generateActivationKey() {
        return RandomStringUtils.randomNumeric(DEF_COUNT);
    }

    /**
     * Generate a reset key.
     *
     * @return the generated reset key.
     */
    public static String generateResetKey() {
        return RandomStringUtils.randomNumeric(DEF_COUNT);
    }

    /**
     * Generate a unique series to validate a persistent token, used in the
     * authentication remember-me mechanism.
     *
     * @return the generated series data.
     */
    public static String generateSeriesData() {
        return RandomStringUtils.randomAlphanumeric(DEF_COUNT);
    }

    /**
     * Generate a persistent token, used in the authentication remember-me mechanism.
     *
     * @return the generated token data.
     */
    public static String generateTokenData() {
        return RandomStringUtils.randomAlphanumeric(DEF_COUNT);
    }

}
