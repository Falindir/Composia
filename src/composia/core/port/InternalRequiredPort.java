package composia.core.port;

/**
 * Created by jimmy on 10/04/16.
 */
public class InternalRequiredPort extends RequiredPort {

    public InternalRequiredPort(String name) {
        super(name, Visibility.INTERNAL);
    }
}
