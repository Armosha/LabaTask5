package by.training.notebook.bean;

import by.training.notebook.CommandEnum;


public class Request {

    private CommandEnum command;


    public Request(CommandEnum command){
        setCommand(command);
    }


    public CommandEnum getCommand() {
        return command;
    }

    public void setCommand(CommandEnum command) {
        if (command == null){
            throw new NullPointerException("Command is null");
        }
        this.command = command;
    }
}
