package com.zsg.practice;


class ZohoSchoolsForGrad
{
	int id;
	String name;
	static String School="Zoho Schools For Graduate Studies";
	ZohoSchoolsForGrad(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void print()
	{
		System.out.println("Roll No : "+id+", Name : "+name+", School : "+School);
	}
}
public class ExNo08 
{
	public static void main(String[] args) 
	{
		ZohoSchoolsForGrad[] obj=new ZohoSchoolsForGrad[4];
		obj[0]=new ZohoSchoolsForGrad(1,"Dani");
		obj[1]=new ZohoSchoolsForGrad(2,"Deva");
		obj[2]=new ZohoSchoolsForGrad(3,"Shiva");
		obj[3]=new ZohoSchoolsForGrad(4,"Guru");
		for(ZohoSchoolsForGrad zsg:obj)
		{
			zsg.print();
		}
	}
}
