package oop.two.bank;

public class Account {
    public String name;
    protected String email;
    private String password;

    public String getPassword(){
        setPassword("abdcd");
        return this.password;
    }
    private void setPassword(String pass){
        this.password = pass;
    }
}
