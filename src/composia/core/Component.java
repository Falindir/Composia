package composia.core;

import composia.core.port.DefaultPort;
import composia.core.port.SelfPort;
import composia.core.port.SuperPort;

/**
 * Created by jimmy on 09/04/16.
 */
public class Component {

    private Descriptor descriptor;

    private DefaultPort defaultP;

    private SuperPort superP;

    private SelfPort self;

    public Component(Descriptor descriptor) {
        this.descriptor = descriptor;
    }

    public Component(String name) {

    }

    public Component() {
        this(Boostrap.componentDescriptor);
    }

    public Descriptor getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(Descriptor descriptor) {
        this.descriptor = descriptor;
    }

    public DefaultPort getDefaultP() {
        return defaultP;
    }

    public SuperPort getSuperP() {
        return superP;
    }

    public SelfPort getSelf() {
        return self;
    }
}
