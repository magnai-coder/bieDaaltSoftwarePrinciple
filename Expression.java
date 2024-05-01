public class Expression {
    public Strint term;
    public int value;
    public String op;
    public Expression(String term, int value, String op){
        this.term = term;
        this.value = value;
        this.op = op;
    }
    public String toString(){
        return term+value+op;
    }
}
