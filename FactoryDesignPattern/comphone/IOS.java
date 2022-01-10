package FactoryDesignPattern.comphone;

public class IOS implements OS {

    @Override
    public void spec() {
        System.out.println("Closed Source OS");
    }

}
