package com.sirius.tech.learn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sirius.tech.learn.dao.AuhtorRepository;
import com.sirius.tech.learn.dto.AutorBasicDTO;
import com.sirius.tech.learn.dto.AutorFullDTO;
import com.sirius.tech.learn.entity.Author;
import com.sirius.tech.learn.service.IAuthorService;

@Service
public class AuthorServiceImpl extends AbstractLearnServiceImpl <Author, AutorBasicDTO, AutorFullDTO,  AuhtorRepository>  implements IAuthorService{

	
	@Autowired
	private AuhtorRepository authorRepository;
	
	
	
	public AuthorServiceImpl() {
		 
		super(Author.class,AutorBasicDTO.class,AutorFullDTO.class);
	}
	
	
	@Override
	public AuhtorRepository getDAO() {
		 
		
		return this.authorRepository;
	}
	
	
	

}
