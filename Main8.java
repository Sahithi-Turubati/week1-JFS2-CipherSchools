package Week1;

public class Main8 {
    private void name(){
        Amazon customer = new Amazon();

        float payableAmount = customer.Transaction(1000);
        System.out.println("Total Payable "+ payableAmount);
    }
}

class Amazon{
    float Transaction(float amt){
        Gpay gpayObj = new Gpay();
        gpayObj.setTxnCharge(0.07f);
        float totalAmount = amt + (amt*gpayObj.getTxnCharge());
        return totalAmount;
        //iphone 10%    ipad5%  macbook 12%

    }
}

class Gpay{
    private float txnCharge=0.5f;
    public void setTxnCharge(float newCharge){
        if (newCharge<=0.05f){
            System.out.println("Invalid TxtCharge");
            return;
        }
        txnCharge=newCharge;
    }
    public float getTxnCharge(){
        return txnCharge;
    }
}
