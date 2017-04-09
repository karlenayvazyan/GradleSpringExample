package am.ak.spring.data.initdestroybean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by karlen on 3/29/17.
 */
public class ExampleBeanInterface implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("destroy interface bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init interface bean");
    }
}
