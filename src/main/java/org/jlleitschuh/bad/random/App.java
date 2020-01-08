/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package org.jlleitschuh.bad.random;

import org.jlleitschuh.bad.random.jhipster.RandomUtil;

import java.util.UUID;

public class App {

    public static void main(String[] args) {
        badLogic();
        badLogicSinkJHipster();
        goodLogic();
    }

    private static void badLogic() {
        String token1 = BadApache3RandomStringUtils.generate();
        String token2 = BadApacheRandomStringUtils.generate();
        String token3 = BadApacheRandomStringGenerator.doGenerate();
        String token4 = BadApacheRandomStringGenerator2.doGenerate();
        String token5 = BadRandom.generate();
        String token6 = BadRandom2.generate();
        String token7 = BadRandom3.generate();
        UUID token8 = BadThreadLocalRandom.generate();
        sensitiveSink(token1, token2, token3, token4, token5, token6, token7, token8);
    }

    private static void badLogicSinkJHipster() {
        setTokenValue(RandomUtil.generateActivationKey());
        setTokenValue(RandomUtil.generatePassword());
        setTokenValue(RandomUtil.generateResetKey());
        setTokenValue(RandomUtil.generateSeriesData());
        setTokenValue(RandomUtil.generateTokenData());
    }

    private static void goodLogic() {
        String token1 = GoodApache3RandomStringUtils.generate();
        String token2 = GoodApacheRandomStringUtils.generate();
        String token3 = GoodApacheRandomStringUtils2.generate();
        String token4 = GoodApacheRandomStringGenerator.doGenerate();
        String token5 = GoodApacheRandomStringGenerator2.doGenerate();
        String token6 = GoodRandom.generate();
        String token7 = GoodRandom2.getInstance().generate();
        UUID token8 = GoodUUID.generate();
        sensitiveSink(token1, token2, token3, token4, token5, token6, token7, token8);
    }

    private static void sensitiveSink(Object... secrets) {
        // No-Op
    }

    private static void setTokenValue(String param){
        // No-Op
    }
}
