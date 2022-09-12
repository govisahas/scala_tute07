class Account(accId:Int,balan: Double = 0.0){

    val accountID = accId
    var balance = balan

    def withdraw(amount:Double) : Unit = {
        this.balance = this.balance - amount
    }

    def deposit(amount:Double) : Unit = {
        this.balance = this.balance + amount
    }

    def transfer(acc:Account, amount:Double) : Unit = {
        if (this.balance < 0.0) println("Insufficient balance")
        else {
            this.withdraw(amount)
            acc.deposit(amount)
        }
    }
}

object accn extends App
{
var bank:List[Account] = List()

def checkNegativeBalance() : Unit = {
    for (acc <- bank) {
        if (acc.balance < 0.0) println("Account ID: " + acc.accountID + " has a negative balance")
    }
}

def sumOfAllBalances() : Double = {
    var sum:Double = 0.0
    for (acc <- bank) {
        sum = sum + acc.balance
    }
    return sum
}

def finalBalance() : Unit = {
    var interest:Double = 0.05
    var overdraft:Double = 0.1

    for (acc <- bank) {
        if (acc.balance < 0.0) {
            acc.balance = acc.balance + (acc.balance * overdraft)
            println("Account ID: " + acc.accountID + " has a negative balance of " + acc.balance+" .Overdraft fee applied")
        }
        else {
        acc.balance = acc.balance + (acc.balance * interest)
        println("Account ID: " + acc.accountID + " has a positive balance of " + acc.balance)
        }
    }
}

    var acc_1 = new Account(1, 1500.0)
    var acc_2 = new Account(2, 2000.0)
    var acc_3 = new Account(3, 3000.0)
    var acc_4 = new Account(4, 8500.0)
    var acc_5 = new Account(5, 9000.0)
    var acc_6 = new Account(6, -1000.0)
    var acc_7 = new Account(7, -2500.0)
    var acc_8 = new Account(8, -3040.0)
    var acc_9 = new Account(9, -5000.0)
    var acc_10 = new Account(10, -1570.0)

    bank = List(acc_1, acc_2, acc_3, acc_4, acc_5, acc_6, acc_7, acc_8, acc_9, acc_10)

    checkNegativeBalance()
    println("\nSum of all balances: " + sumOfAllBalances())
    println("\n")
  
    finalBalance()
}