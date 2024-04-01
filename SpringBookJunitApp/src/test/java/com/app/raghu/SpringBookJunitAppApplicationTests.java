package com.app.raghu;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class SpringBookJunitAppApplicationTests {
	@Mock
	Repository repository;

	@InjectMocks
	Service service;

	@Test
	@Order(5)
	@DisplayName("FIRST TEST")
	void testSuccess() {
		// Setup mock scenario
		try {
			Mockito.when(repository.getData()).thenReturn(Arrays.asList("A", "B", "C"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		List<String> data = service.getDataLen();
		
		Assertions.assertNotNull(data);
		Assertions.assertEquals(3, data.size());
	}
	
	@Test
	@Order(10)
	@DisplayName("SECOND TEST")
	void testException() {
		//setup mock scenario
		try {
			Mockito.when(repository.getData()).thenThrow(new SQLException("Connection Exception"));
		}catch(SQLException e) {
			e.printStackTrace();
		}
		List<String> data = service.getDataLen();
		
		Assertions.assertNotNull(data);
		Assertions.assertEquals(0, data.size());
	}
	

}
