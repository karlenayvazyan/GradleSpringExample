package am.ak.spring.data.util;

/**
 * Created by karlen on 3/27/17.
 */
public class Command {

    private Map state;

    public void setState(Map state) {
        this.state = state;
    }

    public Map getState() {
        return state;
    }
}
