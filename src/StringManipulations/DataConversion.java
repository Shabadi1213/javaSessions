package StringManipulations;

import java.util.Arrays;

public class DataConversion {
	

	public static void main(String[] args) {

      String st = new String("Testing");
      String st1 = st.intern();//Intern method is used to assign a reference variable to the object in String constant pool which has no reference name
      System.out.println(st1);
      
      
      //String to intger:
      
      String t = "100";
      System.out.println(t+20);
      int i = Integer.parseInt(t);
      System.out.println(i+20);
      
      
      
      System.out.println(Integer.MAX_VALUE);
      System.out.println(Integer.MIN_VALUE);
      
      System.out.println(Byte.MAX_VALUE);
      System.out.println(Byte.MIN_VALUE);

      
      //String to Byte
      String a = "120";
      byte a1 = Byte.parseByte(a);
      System.out.println(a1);
      
      
      //String to double
      
      String c = "300.33";
      double c1 = Double.parseDouble(c);
      System.out.println(c1);
      
      //String to long
      
      String d = "350000";
      long d1 = Long.parseLong(d);
      System.out.println(d1);
      
      //String to float:
      String e = "3.5f";
      float e1 = Float.parseFloat(e);
      System.out.println(e1);
      
      
      //Int to String
      
      int f = 200;
      String f1= String.valueOf(f);
      System.out.println(f1+30);
      
      
      //Float to String
      
      float g = 34.56f;
      String g1 = String.valueOf(g);
      System.out.println(g1+30);
      
      //Long to String
      long h = 360000;
      String h1 = String.valueOf(h);
      System.out.println(h1+30);
      
      //Double to String
      double j = 34.678;
      String j1 = String.valueOf(j);
      System.out.println(j1+888);
      
      
      String s = "I|KNOW|JAVA|WITH|SELENIUM|AND|AWS";
//      System.out.println(s);
      
      String arr[] = s.split("\\|");
      System.out.println(Arrays.toString(arr));
      
    
	}

}
