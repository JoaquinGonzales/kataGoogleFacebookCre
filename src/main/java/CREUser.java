public class CREUser {
    private int id;
    private UserData userData;

    public CREUser(int id, UserData userData) {
        this.id = id;
        this.userData = userData;
    }

    public int getId() {
        return id;
    }
}

class UserData {
    private String name;
    private String address;
    private double payment;

    public UserData(String name, String address, double payment) {
        this.name = name;
        this.address = address;
        this.payment = payment;
    }

    @Override
    public String toString()
    {
        return String.format("this employee : %s, Will be payed: %s Bs.", this.name, this.payment);
    }
}