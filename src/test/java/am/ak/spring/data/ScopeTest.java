package am.ak.spring.data;

import am.ak.spring.data.scope.PrototypeBean;
import am.ak.spring.data.scope.SingleToneBean;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by karlen on 3/29/17.
 */
public class ScopeTest {

    SingleToneBean singleToneBean;
    SingleToneBean singleToneBean2;
    SingleToneBean singleToneBean3;

    @Before
    public void setUp() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        singleToneBean = applicationContext.getBean("singleToneBean", SingleToneBean.class);
        singleToneBean2 = applicationContext.getBean("singleToneBean", SingleToneBean.class);
        singleToneBean3 = applicationContext.getBean("singleToneBean", SingleToneBean.class);
    }

    @Test
    public void proxyTest() throws InterruptedException {
        assertNotNull(singleToneBean);
        assertTrue(singleToneBean.isBeanInitialized());
        assertTrue(singleToneBean2.isBeanInitialized());
        assertTrue(singleToneBean3.isBeanInitialized());
    }
}
