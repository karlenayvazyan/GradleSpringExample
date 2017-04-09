package am.ak.spring.data.scope;

/**
 * Created by karlen on 3/29/17.
 */
public class SingleToneBean {

    private PrototypeBean prototypeBean;

    public SingleToneBean(PrototypeBean prototypeBean) {
        this.prototypeBean = prototypeBean;
        System.out.println("init singletone bean");
    }

    public boolean isBeanInitialized() {
        return prototypeBean != null;
    }
}
