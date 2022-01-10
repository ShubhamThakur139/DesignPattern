package FactoryDesignPattern;

import FactoryDesignPattern.comphone.OS;
import FactoryDesignPattern.comphone.OperatingSystemFactory;

class FactoryPattern {
    public static void main(String[] args) {
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS os = osf.getInstance("open");
        os.spec();
        // OS os = new Android();
        // os.spec();
    }
}

// Factory Design Pattern : when we hide which object is going to create from
// the user that is factory design pattern.
// hiding which class object is going to create that is the use of factory
// design pattern