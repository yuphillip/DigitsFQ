import java.util.ArrayList;

public class Digits {
    private ArrayList<Integer> digitList;

    public Digits(int num)
    {
        digitList = new ArrayList<Integer>();
       if(num == 0)
       {
           digitList.add(new Integer(0));
       }

       while (num > 0)
       {
           digitList.add(0, new Integer(num%10));
           num /= 10;
       }
    }

    public boolean isStrictlyIncreasing()
    {
        for(int i = 0;i<digitList.size()-1;i++)
        {
            if((digitList.get(i+1).intValue())<(digitList.get(i).intValue()))
            {
                return false;
            }
        }
        return true;
    }
    public String getDigitList()
    {
        String List = "[";
        for(int i = 0; i<digitList.size();i++)
        {
            List += ("," + digitList.get(i));
        }
        List += "]";
        return List;
    }
}
