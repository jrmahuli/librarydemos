package com.psl.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.psl.dao.LibraryDaoImpl;
import com.psl.entity.Admin;
import com.psl.entity.Book;

public class TestDemo {
	LibraryDaoImpl ldi = new LibraryDaoImpl();
	
	
	@Test
	public void testValidateLogin1() {
		Admin a = new Admin();
		a.setName("jrm");
		a.setPassword("jrm");
		boolean val;
		
		System.out.println(a.getName());
		System.out.println(a.getPassword());
		if(a.getName().equals("jrm") && a.getPassword().equals("jrm")){
			
			val = true;
		}else
		{
			val = false;
		}
		Assert.assertTrue(val);
			
	}

	@Test
	public void testAddBook1() {
		Book book = new Book();
		book.setName("janhvii");
		book.setIsavailable(true);
		boolean a =ldi.addBook1(book);
		Assert.assertTrue(a);
	}

	@Test
	public void testRegisterCustomer1() {
		String name;
		
		Assert.assertTrue(ldi.registerCustomer1("123"));
		name = "srinika";
		Assert.assertTrue(ldi.registerCustomer1(name));
		name = "trupti";
		Assert.assertTrue(ldi.registerCustomer1(name));
	}

}
