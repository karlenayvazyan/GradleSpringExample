package am.ak.spring.data.postpracessor;

import am.ak.spring.data.BaseTest;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by karlen on 4/8/17.
 */
public class InstantiationTracingBeanPostProcessorTest extends BaseTest {

    @Test
    public void testPostProcessor() {
        final Message message = applicationContext.getBean("message", Message.class);
        Message expect = new Message();
        expect.setMessage("Es shat gidem");
        assertEquals(expect, message);
    }

    @Test
    public void testEnvVar() {
        assertEquals("val", System.getenv("VAR"));
    }
}