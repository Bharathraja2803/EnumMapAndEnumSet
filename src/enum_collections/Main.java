package enum_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;

enum WeekDays{SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

public class Main {
	public static void main(String[] args) {
		List<WeekDays> bharathWorkingDays = new ArrayList<>(List.of(WeekDays.MONDAY, WeekDays.WEDNESDAY, WeekDays.THURSDAY, WeekDays.FRIDAY));
		var bharathWeekSet = EnumSet.copyOf(bharathWorkingDays);
		
		displayHeading("Using EnumSet.copyOf method: ");
		System.out.println("EnumSet.copyOf() is a factory method which return a object of type : "+bharathWeekSet.getClass().getSimpleName());
		bharathWeekSet.forEach(System.out::println);
		System.out.println("-".repeat(90));
		
		var allDaysSet = EnumSet.allOf(WeekDays.class);
		displayHeading("Using EnumSet.allOf method: ");
		allDaysSet.forEach(System.out::println);
		System.out.println("-".repeat(90));
		
		var bharathWeekOff = EnumSet.complementOf(bharathWeekSet);
		displayHeading("EnumSet.complementOf: ");
		bharathWeekOff.forEach(System.out::println);
		System.out.println("-".repeat(90));
		
		var businessDays = EnumSet.range(WeekDays.MONDAY, WeekDays.FRIDAY);
		displayHeading("Using EnumSet.range");
		businessDays.forEach(System.out::println);
		System.out.println("-".repeat(90));
		
		Map<WeekDays, String[]> employeeMap = new EnumMap<>(WeekDays.class);
		employeeMap.put(WeekDays.MONDAY, new String[]{"Bharath","Nandha","Jugin","Rajesh"});
		employeeMap.put(WeekDays.WEDNESDAY, new String[]{"Nandha","Jugin","Ramesh"});
		
		displayHeading("Using the EnumMap to create the map");
		employeeMap.forEach((k,v) -> System.out.println("key: "+k+", value: "+Arrays.toString(v)));
		System.out.println("-".repeat(90));
		
	}
	
	private static void displayHeading(String heading) {
		System.out.println(heading);
		System.out.println("=".repeat(heading.length()));
	}
}
