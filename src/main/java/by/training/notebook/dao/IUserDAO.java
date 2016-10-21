package by.training.notebook.dao;

import by.training.notebook.bean.entity.User;
import by.training.notebook.dao.exception.DAOException;
import by.training.notebook.dao.pool.ConnectionPool;


public interface IUserDAO {

    User getUser(String login, ConnectionPool.Connection c) throws DAOException;
    void saveUser(User user, ConnectionPool.Connection c) throws DAOException;
    void deleteUser(long userID, ConnectionPool.Connection c) throws DAOException;

}
