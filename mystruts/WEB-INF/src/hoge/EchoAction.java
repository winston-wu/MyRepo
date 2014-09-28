package hoge;

public class EchoAction {

    private String message;

    public String getMessage() {
    	
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public String execute(){
        System.out.println("call execute. " +
        		"message=" + message);
        return "ok";
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
