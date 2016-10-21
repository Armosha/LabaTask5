package by.training.notebook.view;

import by.training.notebook.bean.Request;
import by.training.notebook.view.exception.ViewException;

import java.util.Scanner;


public class CloseProgram extends View {

    @Override
    public Request createRequest(Scanner scanner) throws ViewException {
        System.out.print("Goodbye user");
        System.exit(0);
        return null;
    }
}
