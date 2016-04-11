package composia.core;

/**
 * Created by jimmy on 09/04/16.
 */
public class Boostrap {

    public static Descriptor componentDescriptor;
    public static Component mainComponent;

    static public Context run() {

        Descriptor componentDescriptor = new Descriptor("Component");

        Boostrap.componentDescriptor = componentDescriptor;

        Component main = new Component();
        Boostrap.mainComponent = main;

        Descriptor descriptorDescriptor = new Descriptor("Descriptor");
        componentDescriptor.setDescriptor(descriptorDescriptor);
        descriptorDescriptor.setDescriptor(descriptorDescriptor);

        main.setDescriptor(componentDescriptor);

        return new Context();
    }

}
