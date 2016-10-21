package by.training.notebook.bean;

import by.training.notebook.CommandEnum;

import java.util.Date;


public class RequestWithDate extends Request {

    private Date date;


    public RequestWithDate(CommandEnum command, Date date){
        super(command);
        setDate(date);
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        if (date == null){
            throw new NullPointerException("Incorrect date");
        }
        this.date = date;
    }
}
