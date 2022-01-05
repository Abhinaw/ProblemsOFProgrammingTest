package programming;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ProjectTest {

	public static void main(String[] args) {
		int count = 0;
		 String sample = "1";
	      char[] chars = sample.toCharArray();
	      StringBuilder sb = new StringBuilder();
	      for(char c : chars){
	         if(Character.isDigit(c)){
	            count++;
	            sb.append(c);
	         }
	      }
	      System.out.println(sb);
	      System.out.println(count);
	}
}
