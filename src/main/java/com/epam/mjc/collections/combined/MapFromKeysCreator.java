package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result = new HashMap<>();

        for (Map.Entry<String, Integer> me :
                sourceMap.entrySet()) {
            Set<String> vs = result.getOrDefault(me.getKey().length(), new HashSet<>());
            vs.add(me.getKey());
            result.put(me.getKey().length(), vs);
        }
        return result;
    }
}
