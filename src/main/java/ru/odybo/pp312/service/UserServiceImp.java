package ru.odybo.pp312.service;

import ru.odybo.pp312.repository.UserDao;
import ru.odybo.pp312.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

  @Autowired
  private UserDao userDao;

  @Transactional
  @Override
  public void add(User user) {
    userDao.add(user);
  }

  @Transactional(readOnly = true)
  @Override
  public List<User> getUsers() {
    return userDao.getUsers();
  }

  @Transactional(readOnly = true)
  @Override
  public User getUserById(Long id) {
    User user = userDao.getUserById(id);
    return user;
  }

  @Transactional
  public User delete(Long id) {
    User user = userDao.getUserById(id);
    userDao.delete(id);
    return user;
  }

  @Transactional
  @Override
  public User update(User user) {
    userDao.update(user);
    return user;
  }

}
