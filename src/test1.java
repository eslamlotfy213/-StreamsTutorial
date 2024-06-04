import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class test1 {

	//COunt the number of names starting with alphabet A in list



	public static void regular()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		int count = 0;

		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;
			}
		}

		System.out.println(count);

	}




	  public  void  streamFilter()
	  {
		  ArrayList<String> names = new ArrayList<String>();
		  names.add("Abhijeet");
		  names.add("Don");
		  names.add("Alekhya");
		  names.add("Adam");
		  names.add("Ram");

		  names.stream().filter(s->s.startsWith("A")).count();


		  Stream.of("Abhijeet","Don").filter(s->
		{
			s.startsWith("A");
		}
		).count();


		  //print all the names of Arr
		  names.stream().filter(s->s.length()>4).forEach(s-> System.out.println(s));

		  //you can use limit(1)




	  }







	public static void main(String[] args) {
		test1.regular();

	}

}

