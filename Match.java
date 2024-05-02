import java.util.*;

public class Match {
    ArrayList<String> variable;
    ArrayList<String> number;
    ArrayList<String> operators;
    Match(ArrayList<String> variable, ArrayList<String> number, ArrayList<String> operators) {
          this.variable = variable;
          this.number = number;
          this.operators = operators;
    }

    public void matcher() throws Exception{
        if(variable.size() <= 3){
        }else{
            throw new Exception("Ugugdul iluu oruulsan bna");
        }
        if(number.size() <= 2){
        }else{
            throw new Exception("Ugugdul iluu oruulsan bna");
        }
        if(operators.size() <= 4){
        }else{
            throw new Exception("Ugugdul iluu oruulsan bna");
        }
        if(Integer.valueOf(number.get(0))<Integer.valueOf(number.get(1))){
        }else{
            throw new Exception("for davtaltiin ehleh utga buruu bna");
        }
        if(variable.get(0) == variable.get(1) && variable.get(1) == variable.get(2)){
        }else{
            throw new Exception("Huvsagchidiin nerlelt uur bna");
        }
    }

}
