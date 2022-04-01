package rs.ac.bg.fon.np.json_api_caller.main;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import rs.ac.bg.fon.np.json_api_caller.domain.Character;

public class Main2 {

	public static void main(String[] args) {
		Character c1 = new Character();
		c1.setId(1);
		c1.setName("Rick Sanchez");
		c1.setStatus("Alive");
		c1.setSpecies("Human");
		c1.setGender("Male");

		Character c2 = new Character();
		c2.setId(2);
		c2.setName("Aqua Rick");
		c2.setStatus("unknown");
		c2.setSpecies("Humanoid");
		c2.setGender("Male");

		Character c3 = new Character();
		c3.setId(3);
		c3.setName("Beth's Mytholog");
		c3.setStatus("Dead");
		c3.setSpecies("Mythological Creature");
		c3.setGender("Female");
		
		Character[] characters = {c1, c2, c3};

		try (PrintWriter out = new PrintWriter(new FileWriter("characters.json"))) {
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			out.print(gson.toJson(characters));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
