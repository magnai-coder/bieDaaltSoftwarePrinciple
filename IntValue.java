public class IntValue extends Expression{
    public int val;
    public IntValue(int val){
        super(val);
        this.val = val;
    }
    public String toString(){
        return Strign.valuOf(val);
    }
}
