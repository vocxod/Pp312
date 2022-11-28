package ru.odybo.pp312.service;

import ru.odybo.pp312.model.User;
import java.util.List;

public interface UserService {

  void add(User user);

  List<User> getUsers();

  User getUserById(Long id);

  User delete(Long id);

  User update(User user);

}
