public class AdminClass extends UserClass {
    private String username;
    private String password;

    public AdminClass(String username, String password) {
        super(username, password);
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    @Override
    public void displayInfo() {
        System.out.println("Admin login successfully!!!!");
        super.displayInfo();
    }
}
