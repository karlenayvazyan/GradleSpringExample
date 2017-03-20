import am.ak.spring.data.service.ClientService;
import am.ak.spring.data.service.DefaultServiceLocator;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by karlen on 3/16/17.
 */
public class FactoryMethodTest extends BaseTest {

    @Test
    public void testGetBeanCreatedByFactoryMethod() {
        ClientService clientService = applicationContext.getBean("clientService", ClientService.class);
        assertNotNull(clientService);
    }

    @Test
    public void testGetBeanCreatedByFactoryBeanAndFactoryMethod() {
        DefaultServiceLocator defaultServiceLocator = applicationContext.getBean("defaultService", DefaultServiceLocator.class);
        assertNotNull(defaultServiceLocator);
    }

    @Test
    public void testGetBeanCreatedByFactoryBeanAndFactoryMethodBaySecondMethod() {
        DefaultServiceLocator defaultServiceLocatorSecond = applicationContext.getBean("defaultServiceSecond", DefaultServiceLocator.class);
        assertNotNull(defaultServiceLocatorSecond);
    }
}
