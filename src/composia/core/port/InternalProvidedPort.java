package composia.core.port;

/**
 * Created by jimmy on 10/04/16.
 */
public class InternalProvidedPort extends ProvidedPort {

    public InternalProvidedPort(String name) {
        super(name, Visibility.INTERNAL);
    }
}
