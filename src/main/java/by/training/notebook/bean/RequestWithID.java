package by.training.notebook.bean;

import by.training.notebook.CommandEnum;


public class RequestWithID extends Request {

    private Long id;


    public RequestWithID(CommandEnum command, Long id){
        super(command);
        setId(id);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        if (id == null){
            throw new NullPointerException("Incorrect id");
        }
        this.id = id;
    }
}
