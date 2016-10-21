package by.training.notebook.bean;

import by.training.notebook.CommandEnum;


public class RequestWithContent extends Request {

    private String content;


    public RequestWithContent(CommandEnum command, String content){
        super(command);
        setContent(content);
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        if (content == null || content.trim().isEmpty()){
            throw new IllegalArgumentException("Incorrect content");
        }
        this.content = content.trim();
    }
}
