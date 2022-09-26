package com.epam.mjc.collections.combined;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Set<String>> me : projects.entrySet()) {
            if (me.getValue().contains(developer)) {
                result.add(me.getKey());
            }
        }
        result.sort((s1, s2) -> s1.length() == s2.length() ? s2.compareTo(s1) : s2.length() - s1.length());
        return result;
    }
}
