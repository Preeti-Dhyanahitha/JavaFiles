class Bank1 {
    static void withdraw(int amount) throws Exception {
        int balance = 3000;

        if (amount > balance) {
            throw new Exception("Insufficient balance in account");
        }
        System.out.println("Withdrawal successful");
    }

    public static void main(String[] args) {
        try {
            withdraw(2000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
