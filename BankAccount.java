public class BankAccount{

    public class SavingsAccount extends BankAccount {
        private double interestRate;


        public SavingsAccount() {
            super(); // Call the constructor of the parent class (BankAccount)
            this.interestRate = 0.05; // Default interest rate
        }

        public class CurrentAccount extends BankAccount {
            private double overdraftLimit;

            public CurrentAccount() {
                super(); // Call the constructor of the parent class (BankAccount)
                this.overdraftLimit = 1000.0; // Default overdraft limit
            }

            public double getOverdraftLimit() {
                return this.overdraftLimit;
            }

            public void setOverdraftLimit(double overdraftLimit) {
                if (overdraftLimit >= 0) {
                    this.overdraftLimit = overdraftLimit;
                } else {
                    System.out.println("Overdraft limit cannot be negative!");
                }
            }
        }

        public double getInterestRate() {
            return this.interestRate;
        }

        public void setInterestRate(double interestRate) {
            if (interestRate >= 0) {
                this.interestRate = interestRate;
            } else {
                System.out.println("Interest rate cannot be negative!");
            }
        }
    }

    private int AccountNumber;
    private String Name;
    private double Balance;

    void displayAccountDetails() {
        System.out.println("Account Number: " + AccountNumber);
        System.out.println("Account Holder Name: " + Name);
        System.out.println("Account Balance: " + Balance);
    }

    // How to use methods("Deposit" and "Withdraw") in the main method of the BankAccount class



    // 2. Getter for "AccountNumber" (Returns the value)
    public int getAccountNumber() {
        return this.AccountNumber;
    }

    // 3. Setter for "AccountNumber" (Updates the value)
    public void setAccountNumber(int accountNumber) {
        this.AccountNumber = accountNumber;
    }

    // 4. Getter for "Balance"
    public double getBalance() {
        return this.Balance;
    }

    // 5. Setter for "Balance" (With validation logic)
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.Balance = balance;
        } else {
            System.out.println("Balance cannot be negative!");
        }
    }
    
    public void setName(String name) {
        this.Name = name;
    }
    


      public BankAccount(){
        AccountNumber = 123456;
        Name = "Jayshankar";
        Balance = 18.56;
      }


      public  static void main(String[] args){
        BankAccount account = new BankAccount();
        System.out.println("Account Number: " + account.AccountNumber);
        System.out.println("Account Holder Name: " + account.Name);
        System.out.println("Account Balance: " + account.Balance);
        account.displayAccountDetails();
        account.setAccountNumber(789012);
        account.displayAccountDetails();
      }
    }

