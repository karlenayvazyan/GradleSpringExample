import am.ak.spring.data.canstuctor.ExampleBean;
import am.ak.spring.data.canstuctor.Foo;
import am.ak.spring.data.canstuctor.SimpleMovieLister;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by karlen on 3/16/17.
 */
public class ConstructorArgumentTest extends BaseTest {

    @Test
    public void testSingleArgument() {
        SimpleMovieLister simpleMovieLister = applicationContext.getBean("simpleMovieLister", SimpleMovieLister.class);
        assertNotNull(simpleMovieLister);
        assertNotNull(simpleMovieLister.getMovieFinder());
    }

    @Test
    public void testMultipleArgument() {
        Foo foo = applicationContext.getBean("foo", Foo.class);
        assertNotNull(foo);
        assertNotNull(foo.getBar());
        assertNotNull(foo.getBaz());
    }

    @Test
    public void testArgumentIntAndString() {
        ExampleBean exampleBean = applicationContext.getBean("exampleBean", ExampleBean.class);
        checkExcampleBean(exampleBean);
    }

    @Test
    public void testArgumentType() {
        ExampleBean exampleBean = applicationContext.getBean("exampleBeanType", ExampleBean.class);
        checkExcampleBean(exampleBean);
    }

    @Test
    public void testArgumentIndex() {
        ExampleBean exampleBean = applicationContext.getBean("exampleBeanIndex", ExampleBean.class);
        checkExcampleBean(exampleBean);
    }

    @Test
    public void testArgumentName() {
        ExampleBean exampleBean = applicationContext.getBean("exampleBeanName", ExampleBean.class);
        checkExcampleBean(exampleBean);
    }

    private void checkExcampleBean(ExampleBean exampleBean) {
        assertNotNull(exampleBean);
        final int expectedYear = 1992;
        final String ultimateAnswer = "42";
        assertEquals(expectedYear, exampleBean.getYears());
        assertEquals(ultimateAnswer, exampleBean.getUltimateAnswer());
    }
}
