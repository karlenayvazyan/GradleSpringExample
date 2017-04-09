package am.ak.spring.data.placeholder;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by karlen on 4/9/17.
 */
public class PlaceholderOverrideExampleTest {

    private ApplicationContext applicationContext;

    @Before
    public void setUp() {
        applicationContext = new ClassPathXmlApplicationContext("property-override.xml");
    }

    @Test
    public void testPropertyOverride() {
        final PlaceholderExample placeholderExample = applicationContext.getBean("placeholderOverrideExample", PlaceholderExample.class);
        assertNotNull(placeholderExample);
        final String expiredUrl = "veryNewUrl";
        assertEquals(expiredUrl, placeholderExample.getUrl());
    }

}