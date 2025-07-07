package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestPropertiesLoader {
    public static Properties testProps;

    public static void load(String testClassName) {
        testProps = new Properties();
        String propFileName = "testdata/" + testClassName + ".properties";
        try (InputStream input = TestPropertiesLoader.class.getClassLoader().getResourceAsStream(propFileName)) {
            if (input != null) {
                testProps.load(input);
            } else {
                throw new RuntimeException("Property file not found: " + propFileName);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}