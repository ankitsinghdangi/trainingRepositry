package com.carwash.demo;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.carwash.demo.controller.Controller;
import com.carwash.demo.model.Register;
import com.carwash.demo.repo.Repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CarwashApplicationTests {

	
    @Autowired
	private Controller cc;
    @MockBean
    private Repository cr;

    
    @Test
    public void getAllUsersTest() {
    	when(cr.findAll()).thenReturn((List<Register>) Stream.of(new Register("sd@gmail.com","dfg")).collect(Collectors.toList()));
    	assertEquals(1,cc.getAllUser().size());
    }
}
