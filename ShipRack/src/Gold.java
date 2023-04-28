public class Gold extends Item {
    public int amt;

    public Gold(int amt) {
        super("Gold", "A round coin with %s stamped on the  front.",20);
        this.amt = amt;
    }
    public int getAmt() {
        return amt;
    }

}
