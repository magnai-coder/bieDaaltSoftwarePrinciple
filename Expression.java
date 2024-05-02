public class Expression {
    public Object term;
    public Variable equation;
    public Object op;
    public Object value;
    public String term2;
    public int integer;

    public Expression(String term2){
        this.term2 = term2;
    }
    public Expression(int integer){
        this.integer = integer;
    }
    public Expression(Object term, Object op, Object value){
        this.term = term;
        this.value = value;
        this.op = op;
    }
    public String toString(){
        return ""+term+op+value;
    }
}
