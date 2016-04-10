package composia.core.port;

/**
 * Created by jimmy on 09/04/16.
 */
public abstract class Port {
    
    private String name;

    private Visibility visibility;

    private Role role;

    public Port(String name, Visibility visibility, Role role) {
        this.name = name;
        this.visibility = visibility;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Port{" +
                "name='" + name + '\'' +
                ", visibility=" + visibility +
                ", role=" + role +
                '}';
    }
}
