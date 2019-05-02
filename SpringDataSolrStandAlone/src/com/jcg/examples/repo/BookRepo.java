package com.jcg.examples.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

import com.jcg.examples.entity.Book;

@EnableSolrRepositories()
public interface BookRepo extends SolrCrudRepository<Book, String>
{

		@Query("title:?0")
		public Book findByBookTitle(String name);
		
}
