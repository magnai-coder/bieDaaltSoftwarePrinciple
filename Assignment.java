public class Assignment {
    public Expression counterVariable;
    public Expression counterRepeate;
    public Expression counterChange;
    public Assignment(Expression counterVariable, Expression counterRepeate, Expression counterChange){
        this.counterVariable = counterVariable;
        this.counterRepeate = counterRepeate;
        this.counterChange = counterChange;
    }
    public String toString(){
        return counterVariable + ';' + counterRepeate + ';' + counterChange;
    }
}
