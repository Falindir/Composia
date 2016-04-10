package composia.core.port;

/**
 * Created by jimmy on 10/04/16.
 */
public class ExternalRequiredPort extends RequiredPort {

    public ExternalRequiredPort(String name) {
        super(name, Visibility.EXTERNAL);
    }
}
