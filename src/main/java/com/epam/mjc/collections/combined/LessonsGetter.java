package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> result = new HashSet<>();
        for (Map.Entry<String, List<String>> me : timetable.entrySet()) {
            for (String x : me.getValue()) {
                result.add(x);
            }
        }
        return result;
    }
}
