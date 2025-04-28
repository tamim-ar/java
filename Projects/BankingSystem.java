import java.util.*;

public class BankingSystem {

    --- Account Class ---
    static class Account {
        private String accountId;
        private String accountHolderName;
        private double balance;
        private List<String> transactionHistory;

        public Account(String accountId, String accountHolderName, double initialBalance) {
            this.accountId = accountId;
            this.accountHolderName = accountHolderName;
            this.balance = initialBalance;
            this.transactionHistory = new ArrayList<>();
            recordTransaction("Account created with balance: " + initialBalance);
        }

        public String getAccountId() {
            return accountId;
        }

        public String getAccountHolderName() {
            return accountHolderName;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                recordTransaction("Deposited: " + amount);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }

        public void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Withdrawal amount must be positive.");
            } else if (balance >= amount) {
                balance -= amount;
                recordTransaction("Withdrew: " + amount);
            } else {
                System.out.println("Insufficient balance.");
            }
        }

        public void transfer(Account targetAccount, double amount) {
            if (amount <= 0) {
                System.out.println("Transfer amount must be positive.");
            } else if (balance >= amount) {
                this.balance -= amount;
                targetAccount.deposit(amount);
                recordTransaction("Transferred: " + amount + " to " + targetAccount.getAccountHolderName());
                targetAccount.recordTransaction("Received: " + amount + " from " + this.accountHolderName);
            } else {
                System.out.println("Insufficient balance.");
            }
        }

        private void recordTransaction(String transactionDetail) {
            transactionHistory.add(transactionDetail);
        }

        public void printTransactionHistory() {
            if (transactionHistory.isEmpty()) {
                System.out.println("No transactions available.");
            } else {
                System.out.println("Transaction History for Account " + accountId + ":");
                for (String transaction : transactionHistory) {
                    System.out.println(transaction);
                }
            }
        }
    }

    // --- User Class ---
    static class User {
        private String username;
        private String password;
        private Account account;

        public User(String username, String password, String accountId, String accountHolderName, double initialBalance) {
            this.username = username;
            this.password = password;
            this.account = new Account(accountId, accountHolderName, initialBalance);
        }

        public String getUsername() {
            return username;
        }

        public boolean authenticate(String password) {
            return this.password.equals(password);
        }

        public Account getAccount() {
            return account;
        }
    }

    // --- BankingSystem Class ---
    static class BankingSystemService {
        private Map<String, User> users;

        public BankingSystemService() {
            users = new HashMap<>();
        }

        public void createUser(String username, String password, String accountId, String accountHolderName, double initialBalance) {
            if (users.containsKey(username)) {
                System.out.println("Username already exists.");
            } else {
                User newUser = new User(username, password, accountId, accountHolderName, initialBalance);
                users.put(username, newUser);
                System.out.println("User created successfully.");
            }
        }

        public User authenticateUser(String username, String password) {
            User user = users.get(username);
            if (user != null && user.authenticate(password)) {
                return user;
            } else {
                System.out.println("Invalid username or password.");
                return null;
            }
        }

        public void showUserAccountDetails(User user) {
            Account account = user.getAccount();
            System.out.println("Account Details:");
            System.out.println("Account ID: " + account.getAccountId());
            System.out.println("Account Holder Name: " + account.getAccountHolderName());
            System.out.println("Balance: " + account.getBalance());
        }

        public void showTransactionHistory(User user) {
            Account account = user.getAccount();
            account.printTransactionHistory();
        }

        public void performDeposit(User user, double amount) {
            Account account = user.getAccount();
            account.deposit(amount);
            System.out.println("Deposit successful. New Balance: " + account.getBalance());
        }

        public void performWithdrawal(User user, double amount) {
            Account account = user.getAccount();
            account.withdraw(amount);
            System.out.println("Withdrawal successful. New Balance: " + account.getBalance());
        }

        public void performTransfer(User user, String targetAccountId, double amount) {
            Account sourceAccount = user.getAccount();
            Account targetAccount = findAccountById(targetAccountId);
            if (targetAccount != null) {
                sourceAccount.transfer(targetAccount, amount);
                System.out.println("Transfer successful. New Balance: " + sourceAccount.getBalance());
            } else {
                System.out.println("Target account not found.");
            }
        }

        private Account findAccountById(String accountId) {
            for (User user : users.values()) {
                if (user.getAccount().getAccountId().equals(accountId)) {
                    return user.getAccount();
                }
            }
            return null;
        }
    }

    // --- Main Class ---
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankingSystemService bankingService = new BankingSystemService();

        // Sample users
        bankingService.createUser("john_doe", "password123", "ACC001", "John Doe", 1000.00);
        bankingService.createUser("jane_smith", "password456", "ACC002", "Jane Smith", 2000.00);

        User currentUser = null;

        while (true) {
            if (currentUser == null) {
                System.out.println("\nBanking System");
                System.out.println("1. Log in");
                System.out.println("2. Exit");
                System.out.print("Enter choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();  // consume newline character

                if (choice == 1) {
                    System.out.print("Enter username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();
                    currentUser = bankingService.authenticateUser(username, password);
                } else if (choice == 2) {
                    break;
                } else {
                    System.out.println("Invalid choice.");
                }
            } else {
                System.out.println("\nWelcome " + currentUser.getUsername());
                System.out.println("1. View Account Details");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Transfer");
                System.out.println("5. View Transaction History");
                System.out.println("6. Log out");
                System.out.print("Enter choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();  // consume newline character

                switch (choice) {
                    case 1:
                        bankingService.showUserAccountDetails(currentUser);
                        break;
                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        bankingService.performDeposit(currentUser, depositAmount);
                        break;
                    case 3:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawalAmount = scanner.nextDouble();
                        bankingService.performWithdrawal(currentUser, withdrawalAmount);
                        break;
                    case 4:
                        System.out.print("Enter target account ID: ");
                        String targetAccountId = scanner.nextLine();
                        System.out.print("Enter amount to transfer: ");
                        double transferAmount = scanner.nextDouble();
                        bankingService.performTransfer(currentUser, targetAccountId, transferAmount);
                        break;
                    case 5:
                        bankingService.showTransactionHistory(currentUser);
                        break;
                    case 6:
                        currentUser = null;
                        System.out.println("Logged out successfully.");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        }

        scanner.close();
    }
}
