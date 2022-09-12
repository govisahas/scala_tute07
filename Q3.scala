class Account(acc:Int, balan:Double = 0.0){

    val accountID = acc
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

object account extends App{
    
        val acc_1 = new Account(1, 1500.0)
        val acc_2 = new Account(2, 2500.0)
    
        acc_1.transfer(acc_2, 500.0)
        println(acc_1.balance)  
        println(acc_2.balance) 
}
