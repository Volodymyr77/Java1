//package lesson9;
//
//public class CreditCard {
//    private BankAccount bankAccount;
//    private boolean isEnoughMoney;
//
//    public CreditCard(BankAccount bankAccount) {
//        this.bankAccount = bankAccount;
//        isEnoughMoney = true;
//
//    }
//
//    public int withdrawMoney(int sum) {
//        try {
//            if (this.bankAccount.getAmountOfMoney() > 0) {
//                System.out.println(Thread.currentThread().getName() + " is going to withdraw" + sum);
//                this.bankAccount.withdrawMoney(sum);
//                Thread.sleep(300);
//                System.out.println(Thread.currentThread().getName() + " left" + this.bankAccount.getAmountOfMoney());
//            } else {
//                isEnoughMoney = false;
//            }
//            catch(InterruptedException e){
//                e.printStackTrace();
//            }
//            return this.bankAccount.getAmountOfMoney();
//        }
//}
//
//    public boolean isEnoughMoney() {
//        return isEnoughMoney;
//    }
//
//    public void setEnoughMoney(boolean enoughMoney) {
//        isEnoughMoney = enoughMoney;
//    }
//
//
//
