class Bank{
    int balance;
    void deposit(int val)
    {
        balance += val;
    }
    void display_balance()
    {
        System.out.println("Available balance: "+balance);
    }

    public static void main(String[] args) {
       Bank b = new Bank();
       b.balance = 100;
       b.deposit(1000);
       b.display_balance();
    }
}