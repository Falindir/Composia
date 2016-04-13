package composia.core;

import composia.core.port.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jimmy on 09/04/16.
 */
public class Component {

    private Descriptor descriptor;

    private DefaultPort defaultP = new DefaultPort();

    private SuperPort superP = new SuperPort();

    private SelfPort self = new SelfPort();

    private Map<String, InternalRequiredPort> internalRequiredPorts = new HashMap<String, InternalRequiredPort>();

    private Map<String, InternalProvidedPort> internalProvidedPorts = new HashMap<String, InternalProvidedPort>();

    private Map<String, ExternalRequiredPort> externalRequiredPorts = new HashMap<String, ExternalRequiredPort>();

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
