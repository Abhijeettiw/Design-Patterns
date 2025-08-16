public class Flyweight {
    private String message;
    private Integer errorCode;

    Flyweight(Integer code) {
        this.message = new ConcreteFlyweight().errorMessage(code);
        this.errorCode = Integer.parseInt(new UnsharedConcreteFlyweight().errorMessage(code));
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }
}
