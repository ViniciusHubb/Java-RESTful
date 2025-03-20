package br.ViniciusHubb.Java_RESTful.service;

import br.ViniciusHubb.Java_RESTful.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
