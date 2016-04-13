package composia.core;

/**
 * Created by jimmy on 09/04/16.
 */
public class Descriptor extends Component {

    private String name;

    private Descriptor superDescriptor;



    public Descriptor(String name, Descriptor superDescriptor) {
        super("Descriptor");
        this.name = name;
        this.superDescriptor = superDescriptor;
    }

    public Descriptor(String name) {
        this(name, Boostrap.componentDescriptor);
    }

    public String getName() {
        return name;
    }

    public Component newInstance() {
        return new Component(this);
    }

    public Descriptor getSuperDescriptor() {
        return superDescriptor;
    }

    @Override
    public String toString() {
        return "Descriptor{" +
                "name='" + name + '\'' +
                ", superDescriptor=" + superDescriptor +
                '}';
    }
}
