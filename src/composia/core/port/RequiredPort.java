package composia.core.port;

import composia.core.port.Port;

/**
 * Created by jimmy on 09/04/16.
 */
public abstract class RequiredPort extends Port {

    public RequiredPort(String name, Visibility visibility) {
        super(name, visibility, Role.REQUIRED);
    }
}
