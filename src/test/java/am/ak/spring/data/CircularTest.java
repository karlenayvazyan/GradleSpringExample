package am.ak.spring.data;

import am.ak.spring.data.circular.A;
import am.ak.spring.data.circular.B;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by karlen on 3/21/17.
 */
public class CircularTest extends BaseTest {

    private final String BEAN_NAME_1 = "bean1";
    private final String BEAN_NAME_2 = "bean2";

    @Test
    public void testCircular() {
        B bean1 = BaseTest.applicationContext.getBean(BEAN_NAME_1, B.class);
        assertNotNull(bean1);
        assertNotNull(bean1.getA());
        assertNotNull(bean1.getTargetName());
        assertEquals(BEAN_NAME_2, bean1.getTargetName());
    }

    @Test
    public void testIDRef() {
        A bean2 = BaseTest.applicationContext.getBean(BEAN_NAME_2, A.class);
        assertNotNull(bean2);
        assertNotNull(bean2.getB());
        assertNotNull(bean2.getTargetName());
        assertEquals(BEAN_NAME_1, bean2.getTargetName());
    }
}
