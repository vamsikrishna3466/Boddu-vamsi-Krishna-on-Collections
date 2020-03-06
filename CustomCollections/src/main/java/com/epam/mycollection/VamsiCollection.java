 package com.epam.mycollection;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class VamsiCollection {
	private static final Logger LOGGER=LogManager.getLogger(VamsiCollection.class);
	private Object []mycollection=new Object[10];
	private int collectionSize=0;
	public int add(Object element)
	{
		if(mycollection.length<=collectionSize)
		{
			updateCapacity();
		}
		mycollection[collectionSize++]=element;
		LOGGER.debug("The element {} is added in collection",element);
		return 1;
	}
	private void updateCapacity()
	{
		Object []mynewcollection=Arrays.copyOf(mycollection, 2*mycollection.length);
		mycollection=mynewcollection;
	}
	
	public int print()
	{

		LOGGER.debug("Printing of an element starts");
		for(int index=0;index<collectionSize;index++)
		{
			LOGGER.debug("Element is {} ",mycollection[index]);
		}
		LOGGER.debug("printing of an element ends");
		return 1;
	}
	private int validPosistion(int posistion)
	{
		if(posistion<0||posistion>=collectionSize)
		{
			return 0;
		}
		else
		{
			return 1;
		}
			
	}
	public Object fetchByPosition(int posistion)
	{
		int p=validPosistion(posistion);
		if(p==0)
		{
			LOGGER.debug("The given posistion {} is not valid so element is not fetched",posistion);
			return -1;
		}
		else
		{
			LOGGER.debug("The element is fetched at posistion {}",posistion);
			return mycollection[posistion];
		}
	}
	public int fetchByValue(Object value)
	{
		for(int index=0;index<collectionSize;index++)
		{
			if(mycollection[index]==value)
			{
				LOGGER.debug("The element {} is found",value);
				return 1;
			}
		}
		LOGGER.debug("The element {} is not found",value);
		return 0;
	}
	public int insertAtPosistion(int posistion,Object value)
	{
	if(mycollection.length==collectionSize+1)
	{
		updateCapacity();
	}
		int p;
		p=validPosistion(posistion);
		if(p==0)
		{
			LOGGER.debug("Invalid posistion for insertion operation");
			return -1;
		}
	for(int index=collectionSize-1;index>=posistion;index--)
		{
			mycollection[index+1]=mycollection[index];
		}
		mycollection[posistion]=value;
		collectionSize=collectionSize+1;
		LOGGER.debug("The value {} is inserted in  posistion {}",value,posistion);
		return 1;
		
	}
	public int removeAtPosistion(int posistion)
	{
		
		int p=validPosistion(posistion);
		if(p==0)
		{
			LOGGER.debug("Invalid posistion for delete operation");
			return -1;
		}
		else
		{
		for(int index=posistion;index<=collectionSize;index++)
		{
			mycollection[index]=mycollection[index+1];
		}
		LOGGER.debug("The value is removed in  posistion {}",posistion);
		collectionSize=collectionSize-1;
		return 1;
		}
	}
}
