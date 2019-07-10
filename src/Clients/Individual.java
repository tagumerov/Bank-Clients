package Clients;

public class Individual extends Client
{
    @Override
    public void addCheckingAccount(double money) //поплнение без комиссии
    {
        checkingAccount += money;
    }

    @Override
    public void takeFromCheckingAccount(double money) // снятие без комиссии
    {
        if(checkingAccount >= money)
        {
            checkingAccount -= money;
        }
        else
        {
            System.out.println("Недостаточно средств на счете!");
        }
    }
}