import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Map {

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




	  public  void streamMap()
	  {
		  ArrayList<String> names = new ArrayList<String>();
		  names.add("Abhijeet");
		  names.add("Don");
		  names.add("Alekhya");

		  Stream.of("Abhijeet","Don").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
				  .forEach(s-> System.out.println(s));


		  List<String>names1 = Arrays.asList("Abhijeet","Don");
		  names1.stream().filter(s->s.startsWith("a")).sorted().map(s->s.toUpperCase())
				  .forEach(s->System.out.println(s));



		  //merge two streams
		  Stream<String>newStream = Stream.concat(names.stream(),names1.stream())
		  newStream.sorted().forEach(s-> System.out.println(s));

	  }



	  public void streamCollect()
	  {

		List<String> li= Stream.of("Abhijeet","Don").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
				  .collect(Collectors.toList());
		  //list
		  //New list

		  List<Integer> values = Arrays.asList(3,2,3,4,3,5);
		  values.stream().distinct().forEach(s-> System.out.println(s));

		  // sort the array and order and select the 3nd
		  List<Integer> li =   values.stream().distinct().sorted().collect(Collectors.toList());
		  System.out.println(li.get(2));




	  }





}

