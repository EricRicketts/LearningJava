package org.example;

public class Satellite implements OrbitEarth {
    /*
        If you use the IntelliJ tools to instantiate the methods, the access modifiers are added
        automatically, otherwise one has to remember to add them in manually or IntelliJ will flag
        an error.
    */
    String className = getClass().getSimpleName();

    @Override
    public String takeOff() {
        return className + " launched by rocket.";
    }

    @Override
    public String land() {
        return className + " fell out of orbit.";
    }

    @Override
    public String fly() {
        return className + " has separated from its rocket.";
    }

    @Override
    public String achieveOrbit() {
        return className + " has achieved orbit.";
    }
}
