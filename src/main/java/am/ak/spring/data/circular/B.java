package am.ak.spring.data.circular;

/**
 * Created by karlen on 3/21/17.
 */
public class B {

    private A a;

    private String targetName;

    public B(final A a) {
        this.a = a;
    }

    public A getA() {
        return a;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }
}
