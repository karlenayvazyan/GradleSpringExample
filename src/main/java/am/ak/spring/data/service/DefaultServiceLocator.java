package am.ak.spring.data.service;

/**
 * Created by karlen on 3/15/17.
 */
public class DefaultServiceLocator {

    private static DefaultServiceLocator defaultServiceLocator = new DefaultServiceLocator();

    private DefaultServiceLocator() {
    }

    public DefaultServiceLocator getInstance() {
        return defaultServiceLocator;
    }

    public DefaultServiceLocator getInstanceSecond() {
        return defaultServiceLocator;
    }
}
