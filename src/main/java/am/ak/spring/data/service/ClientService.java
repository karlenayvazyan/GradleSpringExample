package am.ak.spring.data.service;

/**
 * Created by karlen on 3/15/17.
 */
public final class ClientService {

    public static volatile ClientService clientService;

    private ClientService() {}

    public static ClientService getInstance() {
        if (clientService == null) {
            synchronized (ClientService.class) {
                if (clientService == null) {
                    clientService = new ClientService();
                }
            }
        }
        return clientService;
    }
}
