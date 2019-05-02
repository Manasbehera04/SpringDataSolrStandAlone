package com.jcg.examples.test;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.jcg.examples.entity.Book;
import com.jcg.examples.repo.BookRepo;


public class Application
{
		public static void main(String[] args)
		{
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new ClassPathResource("resources/spring-config.xml").getPath());
				BookRepo bookRepo = context.getBean(BookRepo.class);

				/*Book rrs = new Book();
                rrs.setId("1");
                rrs.setTitle("Red Storm Rising");
                rrs.setDescription("World War III");
                bookRepo.save(rrs);*/
                 
                 
                Book hobbit = new Book();
                hobbit.setId("3");
                hobbit.setTitle("Hobbit");
                hobbit.setDescription("Prelude to LOTR");
                bookRepo.save(hobbit);
                 System.out.println(bookRepo.findById("1"));
                 
                //System.out.println(bookRepo.findById((long) 11));
                //System.out.println(bookRepo.findByBookTitle("Hobbit"));

				context.close();

		}
}
