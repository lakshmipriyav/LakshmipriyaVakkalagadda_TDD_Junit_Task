package tdd;

public class Main implements input{
	public String input_string(String s)
	{
		
		
        StringBuffer sb = new StringBuffer(s);
        if(s.charAt(0)=='A')
        {
            if(s.charAt(1)=='A')
            {
                sb.delete(0,2);
            }
            else{
                sb.delete(0,1);
            }
        }
        else if(s.charAt(1)=='A')
        {
            sb.delete(1,2);
        }
        return sb.toString();
   
	}

}
