package am.ak.spring.data;

import am.ak.spring.data.service.PetStoreServiceImpl;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by karlen on 3/16/17.
 */
public class GetBeanTest extends BaseTest {

    @Test
    public void testPetStoreServiceImpl() {
        PetStoreServiceImpl petStoreService = applicationContext.getBean("petStoreService", PetStoreServiceImpl.class);
        assertNotNull(petStoreService);
    }

    @Test
    public void testPetStoreServiceImplBayNameA() {
        PetStoreServiceImpl petStoreService = applicationContext.getBean("a", PetStoreServiceImpl.class);
        assertNotNull(petStoreService);
    }

    @Test
    public void testPetStoreServiceImplBayNameB() {
        PetStoreServiceImpl petStoreService = applicationContext.getBean("b", PetStoreServiceImpl.class);
        assertNotNull(petStoreService);
    }
}
