package Calculator;

public class Modal {
    public double calculate(long number1,long number2,String operator)
    {
        switch(operator)
        {
            case "+":
                return number1+number2;
            case "-":
                return number1-number2;
            case "*":
                return number1*number2;
            case "/":
                if(number2==0)return 0;
                return (number1/(number2*1.0));
            default:
                break;

        }
        return 0;
    }
}
