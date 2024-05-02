public class Assignment {
    public Expression counter;
    public Expression repeatPart;
    public  Expression changePart;
    public Assignment(Expression counter, Expression repeatPart, Expression changePart){
        this.counter = counter;
        this.repeatPart = repeatPart;
        this.changePart = changePart;
    }
    public String toString(){
        return "("+counter+";"+repeatPart+";"+changePart+")";
    }
}
