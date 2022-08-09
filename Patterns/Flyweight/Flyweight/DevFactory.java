package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class DevFactory {
    Map<String, Developer> developers = new HashMap<>();

    public Developer getDevBySpeciality(String speciality) {
        Developer developer = developers.get(speciality);
        if (developer == null) {
            switch (speciality) {
                case "java":
                        System.out.println("Create Java dev.");
                        developer = new JavaDev();
                        break;
                case "c++":
                        System.out.println("Create C++ dev.");
                        developer = new CppDev();
            }
            developers.put(speciality,developer);
        }
        return developer;


    }
}
