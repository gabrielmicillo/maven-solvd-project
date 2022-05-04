package com.solvd.football.human;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HumanReflection {

    static Logger LOGGER = LogManager.getLogger(HumanReflection.class);

    public static void humanReflection(ArrayList list){
        for (Object c : list) {
            Method[] methods = c.getClass().getMethods();
            for (Method m : methods) {
                if (m.getName().equals("hasAgent")) {
                try {
                    String chain = (String) m.invoke(c);
                    LOGGER.info(chain);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                    e.printStackTrace();
                }

                }
            }
        }
    }
}
