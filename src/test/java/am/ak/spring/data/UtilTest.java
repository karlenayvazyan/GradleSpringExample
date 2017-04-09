package am.ak.spring.data;

import am.ak.spring.data.initdestroybean.ExampleBeanInterface;
import am.ak.spring.data.initdestroybean.ExampleBeanXML;
import org.junit.Test;
import org.springframework.beans.factory.config.PreferencesPlaceholderConfigurer;

import static org.junit.Assert.assertNotNull;

/**
 * Created by karlen on 3/21/17.
 */
public class UtilTest extends BaseTest {

    @Test
    public void testPropertyPlaceholderConfigurer() {
        final PreferencesPlaceholderConfigurer mapping = BaseTest.applicationContext.getBean("mapping", PreferencesPlaceholderConfigurer.class);
        assertNotNull(mapping);
    }

    @Test
    public void testInitAndDestroyBeanXML() {
        ExampleBeanXML exampleBeanXML = BaseTest.applicationContext.getBean("exampleBeanXML", ExampleBeanXML.class);
        assertNotNull(exampleBeanXML);
    }

    @Test
    public void testInitAndDestroyBeanInterface() {
        ExampleBeanInterface exampleBeanXML = BaseTest.applicationContext.getBean("exampleBeanInterface", ExampleBeanInterface.class);
        assertNotNull(exampleBeanXML);
    }
}
