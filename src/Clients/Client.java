package Clients;

abstract public class Client
{
    protected double checkingAccount;

    public Client ()
    {
        checkingAccount = 0.0;
    }

    public double getCheckingAccount() {
        return checkingAccount;
    }

    abstract public void addCheckingAccount(double money);
    abstract public void takeFromCheckingAccount(double money);

}