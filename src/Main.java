import java.util.HashMap;
import java.util.Map;



class ConfigurationManager {
    private static ConfigurationManager instance = new ConfigurationManager();
    private Map<String, String> settings = new HashMap<>();

    ConfigurationManager() {}

    public static ConfigurationManager getInstance() {
        return instance;
    }

    public String get(String key) {
        return settings.get(key);
    }

    public void set(String key, String value) {
        settings.put(key, value);
    }
}


public class Main {
    public static void main(String[] args) {
        ConfigurationManager configureManager = new ConfigurationManager();
        configureManager.get("Hello");

    }
}



