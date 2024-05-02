public class Variable extends Expression {
    public String id;
    public Variable(String id){
        super(id);
        this.id = id;
    }
    public String toString(){
        return id; 
    }
}