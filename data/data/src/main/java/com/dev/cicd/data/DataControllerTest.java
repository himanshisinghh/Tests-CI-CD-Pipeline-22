package com.dev.cicd.data;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
class DataControllerTest {

    @Autowired
    DataController dataController;

    @Test
    void health() {
        assertEquals( "HEALTH CHECK OK!", dataController.healthCheck());
    }

    private void assertEquals(String string, String healthCheck) {
		// TODO Auto-generated method stub
		
	}

	@Test
    void version() {
        assertEquals( "The actual version is 1.0.0", dataController.version());
    }

    @Test
    void nationsLength() {
        Integer nationsLength = dataController.getRandomNations().size();
        assertEquals(10, nationsLength);
    }

    private void assertEquals(int i, Integer nationsLength) {
		// TODO Auto-generated method stub
		
	}

	@Test
    void currenciesLength() {
        Integer currenciesLength = dataController.getRandomCurrencies().size();
        assertEquals(20, currenciesLength);
    }

}

