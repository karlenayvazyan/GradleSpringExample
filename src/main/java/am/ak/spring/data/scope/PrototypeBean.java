package am.ak.spring.data.scope;

/**
 * Created by karlen on 3/29/17.
 */
public class PrototypeBean {

    private String i;

    public PrototypeBean() {
        System.out.println("init prototype bean");
    }
}
