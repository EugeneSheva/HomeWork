package Flyweight;

import java.util.ArrayList;
import java.util.List;

public class MainFlw {
    public static void main(String[] args) {
        DevFactory devFactory = new DevFactory();
        List<Developer>developers = new ArrayList<>();

        developers.add(devFactory.getDevBySpeciality("java"));
        developers.add(devFactory.getDevBySpeciality("java"));
        developers.add(devFactory.getDevBySpeciality("java"));
        developers.add(devFactory.getDevBySpeciality("java"));
        developers.add(devFactory.getDevBySpeciality("java"));
        developers.add(devFactory.getDevBySpeciality("java"));
        developers.add(devFactory.getDevBySpeciality("c++"));
        developers.add(devFactory.getDevBySpeciality("c++"));
        developers.add(devFactory.getDevBySpeciality("c++"));
        developers.add(devFactory.getDevBySpeciality("c++"));
        developers.add(devFactory.getDevBySpeciality("c++"));
        developers.add(devFactory.getDevBySpeciality("c++"));

        for (Developer dev:developers) {
            dev.writeCode();
        }


    }
}
