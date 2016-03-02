package iGradeService;

import java.util.concurrent.ConcurrentHashMap;

// In-memory data source simulating a persistent data store.
public class DataStore {
    private static final ConcurrentHashMap<String, String> map;

    static {
	map = new ConcurrentHashMap<String, String>();
	map.put("Robbie",   "QuestionRobbie");
	map.put("James", "Functino");
	map.put("Charlie", "RebRosterRestlet");
    }
    public static String get(String key) { return map.get(key); }
}