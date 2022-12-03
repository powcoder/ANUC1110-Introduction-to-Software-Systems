https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

import com.fasterxml.jackson.databind.*;

/**
 * The version uses NIO to read in all lines of the user info file
 * and (just to shorten the program as bit) internal iterator
 * (forEach) to go through a json user which has been converted
 * into a map object ((k,v) of the json becomes (key,value) of the map)
 */

public class JacksonSamplerNIO {
	
	public static void main(String[] args) throws IOException {
		assert args != null & args.length > 0;
		ObjectMapper mapper = new ObjectMapper();
		Map<String,Object> user = new HashMap<>();
		List<String> lines = Files.readAllLines(Paths.get(),//you need to specify 
	    //the position of json file
			StandardCharsets.UTF_8);
		int lineCount = 0;
		for (String line : lines) {
			user = mapper.readValue(line, Map.class);
			user.forEach((k,v) ->
				System.out.printf("%s: %s%n", k, v));
			lineCount++;
			System.out.println("=================");
		}
		System.out.printf("The file has %d lines%n", lineCount);		
	}
}