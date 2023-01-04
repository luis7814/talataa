package co.com.talataa.demo.services;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import co.com.talataa.demo.api.ConsumeApi;
import co.com.talataa.demo.model.MoviesInformation;

public class DemoServiceTest {
	
	@Mock
	ConsumeApi consumeApi;
	
	@InjectMocks 
	DemoService demoService;
	
	@Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
	
	@Test
    public void testFindAll() throws Exception {
        MoviesInformation result = demoService.findAll();
        Assert.assertEquals(0, result.getResults().size());
    }

	@Test
    public void testFindById() throws Exception {
        MoviesInformation result = demoService.findById(1);
        Assert.assertEquals(0, result.getResults().size());
    }

}
