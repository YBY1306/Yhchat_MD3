package me.ag2s.tts.services;

import static me.ag2s.tts.utils.CommonTool.sha256Encode;

import java.math.BigInteger;

public class SecTool {

    public static String getSecMsGec(){
        return sha256Encode(getTicks()+Constants.TOKEN).toUpperCase();
    }

    private static long getTicks(){
        BigInteger seed = BigInteger.valueOf(System.currentTimeMillis());
        seed=seed.multiply(BigInteger.valueOf(10000));
        seed=seed.add(new BigInteger("116444736000000000"));
        seed=seed.subtract(seed.mod(BigInteger.valueOf(3000000000L)));
        return seed.longValue();
    }
}
