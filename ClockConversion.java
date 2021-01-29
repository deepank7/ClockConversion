
public class ClockConversion {

	public static void main(String[] args) {
		String s = "12:45:54PM";
		System.out.println(timeConversion(s));
	}
	static String timeConversion(String s) {
		String hour = "", min = "", sec = "", str= "";
        hour = s.substring(0,2);
        min = s.substring(3,5);
        sec = s.substring(6,8);
        char symbol = s.charAt(8);
        if(symbol =='P'){ 
            if(hour.equals("12")){
                hour = hour;
            }else{
            int i=Integer.parseInt(hour); 
            i+=12;
            hour = Integer.toString(i);   
            }
         }
        else if(symbol =='A' && hour.equals("12")){
            hour = "00";
        }
        str = hour + ":"+ min + ":" +sec;
       return str;
    }

}
