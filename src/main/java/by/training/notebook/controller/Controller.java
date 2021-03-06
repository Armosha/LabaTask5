package by.training.notebook.controller;

import by.training.notebook.bean.Request;
import by.training.notebook.bean.Response;
import by.training.notebook.bean.ResponseWithMessage;
import by.training.notebook.command.ICommand;
import by.training.notebook.command.exception.CommandException;
import by.training.notebook.command.factory.CommandFactory;


public class Controller {

    public Response doRequest(Request request){
        Response response;

        try {
            ICommand command = CommandFactory.getInstance().getCommand(request.getCommand());
            response = command.execute(request);
        }
        catch (NullPointerException ex){
            response = new ResponseWithMessage(false, "Incorrect command");
        }
        catch (CommandException ex){
            response = new ResponseWithMessage(false, ex.getMessage());
        }

        return response;
    }
}
