package composia.core.port;

/**
 * Created by jimmy on 09/04/16.
 */
public abstract class ProvidedPort extends Port {

    public ProvidedPort(String name, Visibility visibility) {
        super(name, visibility, Role.PROVIDED);
    }
}
