object Exercise8_1 extends App {

  //  Extend the following BankAccount class to a CheckingAccount class that charges $1
  //  for every deposit and withdrawal.
  //    class BankAccount(initialBalance: Double) {
  //    private var balance = initialBalance
  //    def currentBalance = balance
  //    def deposit(amount: Double) = { balance += amount; balance }
  //    def withdraw(amount: Double) = { balance -= amount; balance }
  //    }

  class BankAccount(initialBalance: Double) { // provided in the exercise 8.1
    private var balance = initialBalance // I cannot access or override it in subclasses!
    def currentBalance = balance
    def deposit(amount: Double) = {
      balance += amount
      balance
    }
    def withdraw(amount: Double) = {
      balance -= amount
      balance
    }
  }
  class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) { // this is the exercise
    val bankCommission = 1.0
    override def deposit(amount: Double): Double = super.deposit(amount - bankCommission)
    override def withdraw(amount: Double): Double = super.withdraw(amount + bankCommission)
  }
  val myAccount = new CheckingAccount(1000.0)
  myAccount.currentBalance
  myAccount.deposit(100)
  myAccount.withdraw(100)
  myAccount.currentBalance
}