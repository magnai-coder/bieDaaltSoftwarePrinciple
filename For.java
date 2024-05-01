public class For {
    public Expression main;
    For(Expression main){

    }
    Variable counter = new Variable();
    public String toString(){
        return "for("+ main + ")";
    }
}
