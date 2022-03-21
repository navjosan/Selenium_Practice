import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_In_Java {

	public static void main(String[] args) {
		
		//To print th unique and sorted list numbers
		
		List<Integer> values=Arrays.asList(1,2,3,6,1,2,4,7,8);
		List<Integer> list=values.stream().distinct().sorted().limit(5).collect(Collectors.toList());
		System.out.println(list.get(3));
		
		// To print the list in upper case
		
		List<String> names=Arrays.asList("Aman","Raj","Karan","Arsh");
		names.stream().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//Print the list names which has character length greater than 5 and ends with letter l, in upper case in sorted manner
		
		ArrayList<String> str = new ArrayList<String>();
		str.add("Rahul");
		str.add("Karan");
		str.add("Rajesh");
		str.add("Rakesh");
		str.add("Naimil");
		
		List<String> list_names=str.stream().filter(s->s.length()>=5).filter(s->s.endsWith("l")).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println("List_Names are"+list_names.get(0));
		
		//To print the count of the names
		
		long counting=Stream.of("A","B","C","D","E").count();
		System.out.println(counting);
	
		
		//Merging two lists
		
		List<String> s=Stream.concat(str.stream(),names.stream()).collect(Collectors.toList());
		System.out.println(s.get(7));
		
	}

}
