package am.ak.spring.data;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;

/**
 * Created by karlen on 3/16/17.
 */
public class ApplicationContextTest {

    @Test
    public void testGetApplicationContextByStringArray() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"daos.xml", "services.xml"});
        assertNotNull(applicationContext);
    }
}
