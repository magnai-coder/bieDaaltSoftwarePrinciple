import java.util.*;

public class Match {
    ArrayList<String> counterVariable;
    ArrayList<String> counterRepeat;
    ArrayList<String> counterChange;
    Match(ArrayList<String> countVariable, ArrayList<String> counterRepeat, ArrayList<String> counterChange) {
          this.counterVariable = countVariable;
          this.counterRepeat = counterRepeat;
          this.counterChange = counterChange;
    }

    public void matcher() throws Exception{
        if(counterVariable.size() == 3){
        }else{
            throw new Exception("Ugugdul dutuu esvel iluu oruulsan bna");
        }
        if(counterRepeat.size() == 3){
        }else{
            throw new Exception("Ugugdul dutuu esvel iluu oruulsan bna");
        }
        if(counterChange.size() == 3){
        }else{
            throw new Exception("Ugugdul dutuu esvel iluu oruulsan bna");
        }
    }

}
