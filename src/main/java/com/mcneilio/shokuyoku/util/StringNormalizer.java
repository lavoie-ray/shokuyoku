package com.mcneilio.shokuyoku.util;

public class StringNormalizer {

    public static String normalizeKey(String key) {
        return normalizeTopic(key).replaceAll("\\.","_");
    }

    public static String normalizeTopic(String topicName) {
        return topicName.replaceAll("[^a-zA-Z\\d.]", "_")
            .replaceAll("([A-Z]+)([A-Z][a-z])", "$1_$2") // Not sure which case this was solving for
            .replaceAll("([a-z\\d])([A-Z])", "$1_$2")
            .toLowerCase();
    }
}
