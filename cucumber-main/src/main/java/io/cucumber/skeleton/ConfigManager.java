package io.cucumber.skeleton;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigManager {

    public static String getProp(String propName){

        try (InputStream input = new FileInputStream("build/resources/main/config.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);
            // prop.get("url")
            // get the property value and print it out
            return prop.getProperty(propName);


        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;

    }
}
