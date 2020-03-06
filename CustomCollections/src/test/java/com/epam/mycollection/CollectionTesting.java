package com.epam.mycollection;
import static org.junit.Assert.*;

import org.junit.Test;

import com.epam.mycollection.VamsiCollection;

public class CollectionTesting {

	@Test
	public void test() {
		VamsiCollection vamsicollectionobject= new VamsiCollection();
		assertEquals(1,vamsicollectionobject.add("a"));
		assertEquals(1,vamsicollectionobject.add("b"));
		assertEquals(1,vamsicollectionobject.add("c"));
		assertEquals(1,vamsicollectionobject.add("d"));
		assertEquals(1,vamsicollectionobject.add("e"));
		assertEquals(1,vamsicollectionobject.add("f"));
		assertEquals(1,vamsicollectionobject.add("g"));
		assertEquals(1,vamsicollectionobject.add("h"));
		assertEquals(1,vamsicollectionobject.add("i"));
		assertEquals(1,vamsicollectionobject.add("j"));
		assertEquals(1,vamsicollectionobject.add("k"));
		assertEquals(1,vamsicollectionobject.add("l"));
		assertEquals(1,vamsicollectionobject.add(1));
		assertEquals(1,vamsicollectionobject.print());
		assertEquals((Object)"b",vamsicollectionobject.fetchByPosition(1));
		assertEquals(-1,vamsicollectionobject.fetchByPosition(87));
		assertEquals(1,vamsicollectionobject.fetchByValue("k"));
		assertEquals(0,vamsicollectionobject.fetchByValue(2));
		assertEquals(-1,vamsicollectionobject.fetchByPosition(25));
		assertEquals(1,vamsicollectionobject.insertAtPosistion(1,12));
		assertEquals(1,vamsicollectionobject.insertAtPosistion(5,12.45));
		assertEquals(1,vamsicollectionobject.insertAtPosistion(8,"z"));
		assertEquals(-1,vamsicollectionobject.insertAtPosistion(-1,12));
		assertEquals(-1,vamsicollectionobject.insertAtPosistion(100,134));
		assertEquals(1,vamsicollectionobject.print());
		assertEquals(1,vamsicollectionobject.removeAtPosistion(2));
		assertEquals(-1,vamsicollectionobject.removeAtPosistion(50));
		
		assertEquals(1,vamsicollectionobject.print());
		assertEquals(0,vamsicollectionobject.fetchByValue(55));
		assertEquals(1,vamsicollectionobject.add("l"));
		assertEquals(1,vamsicollectionobject.add("k"));
		assertEquals(1,vamsicollectionobject.add("m"));
		assertEquals(1,vamsicollectionobject.add("m"));
		assertEquals(1,vamsicollectionobject.insertAtPosistion(12,"hello"));
		
	
		
		
		
		
		
	}

}
