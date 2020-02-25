class BankAccount(initialBalance:Double) { // provided in the exercise 8.1
  private var balance = initialBalance // I cannot access or override it in subclasses!
  def currentBalance = balance
  def deposit(amount:Double) = { balance += amount; balance }
  def withdraw(amount:Double) = { balance -= amount; balance }
}

class SavingsAccount(initialBalance:Double) extends BankAccount(initialBalance) { // this is the exercise
  val bankCommission = 1.0
  private var freeCounter = 0
  def applyBankCommission = {
    freeCounter += 1
    if (freeCounter > 3) super.withdraw(bankCommission)
  }
  val monthlyInterest = 0.01
  def earnMonthlyInterest = {
    freeCounter = 0
    super.deposit(super.currentBalance*monthlyInterest)
  }
  override def deposit(amount:Double) = { applyBankCommission; super.deposit(amount) }
  override def withdraw(amount:Double) = { applyBankCommission; super.withdraw(amount) }
}

val myAccount = new SavingsAccount(2000.0)
myAccount.currentBalance
myAccount.deposit(100)
myAccount.deposit(100)
myAccount.withdraw(200)
myAccount.deposit(101)
myAccount.earnMonthlyInterest
myAccount.withdraw(100)
