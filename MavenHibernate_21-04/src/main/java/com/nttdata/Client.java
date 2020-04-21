package com.nttdata;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		
		
		Configuration config=new Configuration();
		config.configure("HibernateConfig.xml");
		
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		System.out.println("****************************************WELCOME****************************************");
		System.out.println("Please Enter your choice \n Press 1:Insert \t 2:Display");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
				Transaction tx=session.beginTransaction();
		/*Object o=session.load(Category.class, new Integer(85));
		Category c=(Category)o;*/
		switch(ch)
		{
			case 1:
				Category catg=new Category();
				
				System.out.println("Enter Category Id");
				int catID=sc.nextInt();
				System.out.println("Enter Category Name");
				String catName=sc.next();
				
				catg.setCategoryId(catID);
				catg.setCategoryName(catName);
				
				System.out.println("Enter 3 Products Details");
				System.out.println("Enter Product Id");
				int pID=sc.nextInt();
				System.out.println("Enter Product Name");
				String pName=sc.next();
				System.out.println("Enter Product Cost");
				Double pcost=sc.nextDouble();

				Product p1=new Product();
				p1.setProdId(pID);
				p1.setProdName(pName);
				p1.setProdCost(pcost);
				p1.setCtgry(catg);
				
				System.out.println("Enter Product Id");
				int pID2=sc.nextInt();
				System.out.println("Enter Product Name");
				String pName2=sc.next();
				System.out.println("Enter Product Cost");
				Double pcost2=sc.nextDouble();

				Product p2=new Product();
				p2.setProdId(pID2);
				p2.setProdName(pName2);
				p2.setProdCost(pcost2);
				p2.setCtgry(catg);
				
				System.out.println("Enter Product Id");
				int pID3=sc.nextInt();
				System.out.println("Enter Product Name");
				String pName3=sc.next();
				System.out.println("Enter Product Cost");
				Double pcost3=sc.nextDouble();
				
				Product p3=new Product();
				p3.setProdId(pID3);
				p3.setProdName(pName3);
				p3.setProdCost(pcost3);
				p3.setCtgry(catg);
				
				session.save(p1);
				session.save(p2);
				session.save(p3);
							
				tx.commit();
				session.close();				
				break;
				
			case 2:
				
				Query query=session.createQuery("from Product");
				List list=query.list();
				Iterator it=list.iterator();
				System.out.println("****************************************Product details Are****************************************");
				while(it.hasNext())
				{
					Object ob=it.next();
					Product p=(Product)ob;
					System.out.println("ID: "+p.getProdId()+"\t Name :"+p.getProdName()+"\t Cost :"+p.getProdCost()+"\t"+p.getCtgry());
					
					
				}
				
				/*System.out.println("Category Details");
				System.out.println(c.getCategoryId());
				System.out.println(c.getCategoryName());
				Set s1=c.getProducts();
				Iterator it=s1.iterator();
				while(it.hasNext())
				{
					Object o1=it.next();
					Product p=(Product)o1;
					System.out.println(c);
				}*/
				tx.commit();
				session.close();
				break;
		}
			

	}

}
