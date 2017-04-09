package am.ak.spring.data.util;

import org.springframework.context.ApplicationContext;

/**
 * Created by karlen on 3/27/17.
 */
public abstract class CommandManager {

    private ApplicationContext applicationContext;

    public Command process(Map commandState) {
        Command command = createCommand();
        command.setState(commandState);
        return command;
    }

    public abstract Command createCommand();
}
