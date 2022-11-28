package ru.odybo.pp312.repository;

import ru.odybo.pp312.model.User;

import java.util.List;

public interface UserDao {

  void add(User user);

  User update(User user);

  List<User> getUsers();

  User getUserById(Long id);

  void delete(Long id);

}
