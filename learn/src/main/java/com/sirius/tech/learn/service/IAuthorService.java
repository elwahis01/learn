package com.sirius.tech.learn.service;

import com.sirius.tech.learn.dao.AuhtorRepository;
import com.sirius.tech.learn.dto.AutorBasicDTO;
import com.sirius.tech.learn.dto.AutorFullDTO;
import com.sirius.tech.learn.entity.Author;

public interface IAuthorService  extends IAbstractLearnService<Author, AutorBasicDTO,  AutorFullDTO ,AuhtorRepository>{

}
