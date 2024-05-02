import java.util.*;
public class For {
    public ArrayList<String> sortedCounterStartVariable;
    public ArrayList<String> sortedCounterRepeatCount;
    public ArrayList<String> sortedCounterChange;
    For(){
    }
    For(ArrayList<String> sortedCounterStartVariable, ArrayList<String> sortedCounterRepeatCount, ArrayList<String> sortedCounterChange){
         this.sortedCounterChange = sortedCounterChange;
         this.sortedCounterRepeatCount = sortedCounterRepeatCount;
         this.sortedCounterStartVariable = sortedCounterStartVariable;
    }
    public String toString(){
      
    Variable variable1 = new Variable(sortedCounterStartVariable.get(0));
    Variable equation = new Variable(sortedCounterStartVariable.get(2));
    IntValue intValue1 = new IntValue(Integer.valueOf(sortedCounterStartVariable.get(1)));

    Variable variable2 = new Variable(sortedCounterRepeatCount.get(0));
    Variable operator = new Variable(sortedCounterRepeatCount.get(2));
    IntValue counter = new IntValue(Integer.valueOf(sortedCounterRepeatCount.get(1)));

    Variable variable3 = new Variable(sortedCounterChange.get(0));
    Variable operators = new Variable(sortedCounterChange.get(2));
    Variable operators2 = new Variable(sortedCounterChange.get(1));
    
    Expression counterStartPart = new Expression(variable1, equation, intValue1);
    Expression counterRepeatPart = new Expression(variable2, operator, counter);
    Expression counterChangePart = new Expression(variable3, operators, operators2);
    
    Assignment source = new Assignment(counterStartPart,counterRepeatPart,counterChangePart);
     return "for"+ source;
    }
}
