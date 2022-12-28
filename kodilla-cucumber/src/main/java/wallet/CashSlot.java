package wallet;

public class CashSlot {

    private int contents;
    private String message;

    public int getContents() {
        return contents;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void dispense(int amount) {
            this.contents = amount;
    }
}
