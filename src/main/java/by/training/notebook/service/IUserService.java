package by.training.notebook.service;


import by.training.notebook.service.exception.ServiceException;


public interface IUserService {

    boolean login(String login, String password) throws ServiceException;
    void register(String login, String password) throws ServiceException;
    void deleteCurrentUser() throws ServiceException;

}
