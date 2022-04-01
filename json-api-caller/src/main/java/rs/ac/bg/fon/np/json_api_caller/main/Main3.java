package rs.ac.bg.fon.np.json_api_caller.main;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import rs.ac.bg.fon.np.json_api_caller.domain.Character;


public class Main3 {

	public static void main(String[] args) {
		try(FileReader in = new FileReader("characters.json")){
			List<Character> characters;
			
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			Type type = new TypeToken<LinkedList<Character>>() {}.getType();
			
			characters = gson.fromJson(in, type);
			
			for(Character ch: characters)
				System.out.println(ch);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
