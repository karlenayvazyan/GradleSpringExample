package am.ak.spring.data;

import am.ak.spring.data.util.Command;
import am.ak.spring.data.util.CommandManager;
import am.ak.spring.data.util.Map;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by karlen on 3/27/17.
 */
public class CommandManagerTest extends BaseTest {

    @Test
    public void testIsExistCommandManager() {
        CommandManager commandManager = applicationContext.getBean("commandManager", CommandManager.class);
        assertNotNull(commandManager);
        Map commandState = new Map();
        Command process = commandManager.process(commandState);
        assertNotNull(process);
        assertNotNull(process.getState());
    }
}
