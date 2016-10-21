package by.training.notebook.service.impl;

import by.training.notebook.CommandEnum;
import by.training.notebook.service.ICommandLineService;


public class CommandLineService implements ICommandLineService {

    @Override
    public String getHelpDescription() {
        StringBuilder builder = new StringBuilder();
        for (CommandEnum e : CommandEnum.values()){
            builder.append(e.getDescription()).append("\n");
        }
        return builder.toString();
    }

}
