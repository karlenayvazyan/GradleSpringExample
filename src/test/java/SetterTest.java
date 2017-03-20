import am.ak.spring.data.setter.SimpleMovieLister;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by karlen on 3/16/17.
 */
public class SetterTest extends BaseTest {

    @Test
    public void testInitResourceBySetter() {
        SimpleMovieLister simpleMovieLister = applicationContext.getBean("simpleMovieListerSetter", SimpleMovieLister.class);
        assertNotNull(simpleMovieLister);
        assertNotNull(simpleMovieLister.getMovieFinder());
    }
}
