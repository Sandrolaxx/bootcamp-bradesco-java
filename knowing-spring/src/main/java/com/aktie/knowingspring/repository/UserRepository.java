package com.aktie.knowingspring.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.aktie.knowingspring.handler.BusinessException;
import com.aktie.knowingspring.model.User;

@Repository
public class UserRepository {

    public void save(User user){

        if (user == null || user.getLogin() == null) {
            throw new BusinessException("Necessário informar login!");
        }

        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        System.out.println(user);
    }

    public void update(User usuario){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }

    public void remove(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }

    public List<User> listAll(){
        System.out.println("LIST - Listando os usários do sistema");
        List<User> usuarios = new ArrayList<>();
        usuarios.add(new User("gleyson","password"));
        usuarios.add(new User("frank","masterpass"));
        return usuarios;
    }

    public User finById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new User("gleyson","password");
    }

    public User finByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar um usuário", username));
        return new User("gleyson","password");
    }

}
