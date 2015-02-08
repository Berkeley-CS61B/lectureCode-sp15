/** 
 *  @author Josh Hug
 */

public class SomeOtherPersonsCode {
    /** 
     */

    public static void main(String[] args) {
        SList sl = new MaxSList(10);
        sl.insertFront(100);        
        MaxSList msl5 = (MaxSList) sl;
        MaxSList msl4 = (SList) msl5;
    }
} 