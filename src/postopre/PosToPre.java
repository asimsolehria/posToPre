
package postopre;

import java.util.Stack;

/**
 *
 * @author asim
 */
public class PosToPre 
{    
    
    public String posToPre(String exp)
    {
        Stack<String> stack= new Stack<>();
        
        for (int i = 0; i < exp.length(); i++) 
        {
            char c=exp.charAt(i);
            
            if(Character.isLetterOrDigit(c))
                stack.push(c+"");
            else
            {
                String opnd1=stack.pop();
                String opnd2=stack.pop();
                String prefix=c+opnd2+opnd1;
                stack.push(prefix);
            }
            
        }
        return stack.pop();
    }
}
