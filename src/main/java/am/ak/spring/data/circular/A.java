package am.ak.spring.data.circular;

import am.ak.spring.data.service.PetStoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by karlen on 3/21/17.
 */
public class A {

//    @Autowired
//    private PetStoreServiceImpl petStoreService;

//    private final B b;
//
//    public A(final B b) {
//        this.b = b;
//    }

    private B b;

    private String targetName;

    public void setB(B b) {
        this.b = b;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public B getB() {
        return b;
    }

    public String getTargetName() {
        return targetName;
    }
}
