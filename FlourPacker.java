public class FlourPacker {
    // write your code here
    public static boolean canPack(int bigCount, int smallCount, int goal)
    {
        int bigCountKilo = bigCount*5;
        if (smallCount<0 || bigCount<0 ||goal<0)
        {
            return false;
        }
    if(bigCountKilo+smallCount*1 == goal){
        return true;
    }else if((bigCountKilo>=goal&&bigCountKilo%goal == 0)||(bigCountKilo>=goal&&goal%5<=smallCount)){
        return true;
    }else if(smallCount>=goal){
        return true;
    }else if(bigCountKilo+smallCount>goal&&goal%bigCountKilo<=smallCount){
        return true;
    }else{
        return false;
    }
}
}