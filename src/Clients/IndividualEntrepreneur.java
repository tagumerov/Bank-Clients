package Clients;

public class IndividualEntrepreneur extends Client
{

    @Override
    public void addCheckingAccount(double money) //комиссия
    {
        if(money < 1000)
        {
            checkingAccount += (money -(money/100));
        }
        else if (money >= 1000)
        {
            checkingAccount += (money -(money/200));
        }
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
