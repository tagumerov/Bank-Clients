package Clients;

public class Entity extends Client
{

    @Override
    public void addCheckingAccount(double money) //поплнение без комиссии
    {
        checkingAccount += money;
    }

    @Override
    public void takeFromCheckingAccount(double money) // снятие - комиссия 1%
    {
        if(checkingAccount >= (money + (money/100)))
        {
            checkingAccount -= (money + (money/100));
            System.out.println("Комиссия 1% от снятой суммы и составляет " + (money/100) + " рублей");
        }
        else
        {
            System.out.println("Недостаточно средств на счете!");
        }
    }
}
