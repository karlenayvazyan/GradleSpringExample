package am.ak.spring.data.placeholder;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by karlen on 4/9/17.
 */
public class PlaceholderExampleTest {

    private ApplicationContext applicationContext;

    @Before
    public void setUp() {
        applicationContext = new ClassPathXmlApplicationContext("placeholder.xml");
    }

    @Test
    public void testProperties() {
        final PlaceholderExample placeholderExample = applicationContext.getBean("placeholderExample", PlaceholderExample.class);
        assertNotNull(placeholderExample);
        final String expectUrl = "test url";
        final String expectUsername = "test username";
        final String expectPassword = "test password";
        assertEquals(expectUrl, placeholderExample.getUrl());
        assertEquals(expectUsername, placeholderExample.getUsername());
        assertEquals(expectPassword, placeholderExample.getPassword());
    }

    @Test
    public void testCustomStrategyClass() {
        final ClassWhichSpecifyInProperties classWhichSpecifyInProperties = applicationContext.getBean("customStrategyClass", ClassWhichSpecifyInProperties.class);
        assertNotNull(classWhichSpecifyInProperties);
    }

}