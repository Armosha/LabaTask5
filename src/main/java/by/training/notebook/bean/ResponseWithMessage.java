package by.training.notebook.bean;


public class ResponseWithMessage extends Response {

    private String message;


    public ResponseWithMessage(String message){
        super(true);
        setMessage(message);
    }

    public ResponseWithMessage(boolean status, String message){
        super(status);
        setMessage(message);
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        if (message == null || message.trim().isEmpty()){
            throw new IllegalArgumentException("Incorrect message");
        }
        this.message = message.trim();
    }
}
