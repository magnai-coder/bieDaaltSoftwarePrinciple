
import java.util.ArrayList;
import java.util.HashMap;

public class Lexer {

    String inputLine;

    Lexer(String inputLine) {
        this.inputLine = inputLine;
    }
    ArrayList<String> variable = new ArrayList<String>();
    ArrayList<String> operator = new ArrayList<String>();
    ArrayList<String> value = new ArrayList<String>();
    HashMap<String, String> expression = new HashMap<String, String>();
    ArrayList<String> sortedCounterStartVariable = new ArrayList<String>();
    ArrayList<String> sortedCounterChange = new ArrayList<String>();
    ArrayList<String> sortedCounterRepeatCount = new ArrayList<String>();

    public void divideCheckCode(){
        boolean checkFor = inputLine.substring(0, 3).contains("for(");
        boolean checkSign = inputLine.substring(inputLine.length() - 1, inputLine.length()).contains(")");
        try {
            if ((checkFor == true) && (checkSign == true)) {
                inputLine = inputLine.replace("for(", "");
                inputLine = inputLine.replace(")", "");
                String[] divideForString = inputLine.split(";", 2);
                String counterStartVariable = expression.put("Huvsagch", divideForString[0]);
                String counterRepeatCount = expression.put("Davtaltduusah", divideForString[1]);
                String counterChange = expression.put("ParameterUurchluh", divideForString[2]);
                int count = 0;

                ArrayList<String> numberArray = new ArrayList<String>();
                ArrayList<String> idArray = new ArrayList<String>();
                ArrayList<String> operationArray = new ArrayList<String>();
                ArrayList<String> scriptArray = new ArrayList<String>();
                // i=0
                while (count < counterStartVariable.length()) {
                    String id = "";
                    while (count < counterStartVariable.length()) {
                        if (Character.isLetter(counterStartVariable.charAt(count))) {
                            id += counterStartVariable.charAt(count);
                            if (count < counterStartVariable.length() - 1) {
                                count += 1;
                            }
                            if (Character.isDigit(counterStartVariable.charAt(count))) {
                                while (Character.isDigit(counterStartVariable.charAt(count))) {
                                    id += counterStartVariable.charAt(count);
                                    if (count < counterStartVariable.length() - 1) {
                                        count += 1;
                                    } else {
                                        break;
                                    }

                                }
                            }
                        } else {
                            if (!id.equals("")) {
                                idArray.add(id);
                            }
                            break;
                        }
                    }

                    String num = "";
                    while (count < counterStartVariable.length()) {
                        if (Character.isDigit(counterStartVariable.charAt(count))) {
                            num += counterStartVariable.charAt(count);
                            count += 1;
                            if (count == counterStartVariable.length()) {
                                numberArray.add(num);
                            }
                        } else {
                            if (!num.equals("")) {
                                numberArray.add(num);
                            }
                            break;

                        }
                    }
                    while (count < counterStartVariable.length()) {
                        if (Character.isWhitespace(counterStartVariable.charAt(count))) {
                            if (count < counterStartVariable.length() - 1) {
                                count += 1;
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (count == counterStartVariable.length()) {
                        break;
                    }
                    String lineChar = String.valueOf(counterStartVariable.charAt(count));
                    if (lineChar.equals("=")) {
                        operationArray.add(lineChar);
                        if (count < counterStartVariable.length()) {
                            count += 1;
                        } else {
                            break;
                        }
                    }

                }
                sortedCounterStartVariable.add(idArray.get(0));
                sortedCounterStartVariable.add(numberArray.get(0));
                sortedCounterStartVariable.add(operationArray.get(0));


                //i++
                while (count < counterChange.length()) {
                    String id = "";
                    while (count < counterChange.length()) {
                        if (Character.isLetter(counterChange.charAt(count))) {
                            id += counterChange.charAt(count);
                            if (count < counterChange.length() - 1) {
                                count += 1;
                            }
                            if (Character.isDigit(counterChange.charAt(count))) {
                                while (Character.isDigit(counterChange.charAt(count))) {
                                    id += counterChange.charAt(count);
                                    if (count < counterChange.length() - 1) {
                                        count += 1;
                                    } else {
                                        break;
                                    }
        
                                }
                            }
                        } else {
                            if (!id.equals("")) {
                                idArray.add(id);
                            }
                            break;
                        }
                    }
        
                    while (count < counterChange.length()) {
                        if (Character.isWhitespace(counterChange.charAt(count))) {
                            if (count < counterChange.length() - 1) {
                                count += 1;
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (count == counterChange.length()) {
                        break;
                    }
                    
                    String lineChar = String.valueOf(counterStartVariable.charAt(count));
                    if (lineChar == "+" || lineChar == "-") {
                        operationArray.add(lineChar);
                        if (count < counterRepeatCount.length()){
                            count += 1;
                        } else {
                            break;
                        }
                    }
                   
        
                }
                sortedCounterChange.add(idArray.get(1));
                sortedCounterChange.add(operationArray.get(1));
                sortedCounterChange.add(operationArray.get(2));



                //i<input

                while (count < counterRepeatCount.length()) {
                    String id = "";
                    while (count < counterRepeatCount.length()) {
                        if (Character.isLetter(counterRepeatCount.charAt(count))) {
                            id += counterRepeatCount.charAt(count);
                            if (count < counterRepeatCount.length() - 1) {
                                count += 1;
                            }
                            if (Character.isDigit(counterRepeatCount.charAt(count))) {
                                while (Character.isDigit(counterRepeatCount.charAt(count))) {
                                    id += counterRepeatCount.charAt(count);
                                    if (count < counterRepeatCount.length() - 1) {
                                        count += 1;
                                    } else {
                                        break;
                                    }
        
                                }
                            }
                        } else {
                            if (!id.equals("")) {
                                idArray.add(id);
                            }
                            break;
                        }
                    }
        
                    String num = "";
                    while (count < counterRepeatCount.length()) {
                        if (Character.isDigit(counterRepeatCount.charAt(count))) {
                            num += counterRepeatCount.charAt(count);
                            count += 1;
                            if (count == counterRepeatCount.length()) {
                                numberArray.add(num);
                            }
                        } else {
                            if (!num.equals("")) {
                                numberArray.add(num);
                            }
                                break;
                            
                        }
                    }
                    while (count < counterRepeatCount.length()) {
                        if (Character.isWhitespace(counterRepeatCount.charAt(count))) {
                            if (count < counterRepeatCount.length() - 1) {
                                count += 1;
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (count == counterRepeatCount.length()) {
                        break;
                    }
                    String lineChar = String.valueOf(counterStartVariable.charAt(count));
                    if (lineChar == "<" || lineChar == ">" || lineChar == "=>" || lineChar == "<=") {
                        operationArray.add(lineChar);
                        if (count < counterChange.length()){
                            count += 1;
                        } else {
                            break;
                        }
                    }
                }
                sortedCounterRepeatCount.add(idArray.get(2));
                sortedCounterRepeatCount.add(numberArray.get(1));
                sortedCounterRepeatCount.add(operationArray.get(3));
                //hemjee bolon aguulagdaj bui utguudiig 
                //shalgaj Match aldaag olno daraa n bolson bol 
                //Token bolgoj shideed ter tokenuudiig 
                //classuud barij avch udamshuulan For classiig
                //toString bie bolgod tuuniig main hevlen gargana
                Match check = new Match(sortedCounterStartVariable, sortedCounterRepeatCount, sortedCounterChange);
                check.matcher();
            }
        } catch (Exception e) {
            System.out.println("for() uusgelt buruu bna");

        }
    }
    return new For(sortedCounterStartVariable, sortedCounterRepeatCount, sortedCounterChange);
}
