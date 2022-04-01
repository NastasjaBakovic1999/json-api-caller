package rs.ac.bg.fon.np.json_api_caller.main;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import com.google.gson.JsonObject;
import rs.ac.bg.fon.np.json_api_caller.domain.Character;

public class Main4 {

	public static void main(String[] args) {
        JsonObject c = new JsonObject();
		
		c.addProperty("id", 5);
		c.addProperty("name", "Morty Smith");
		c.addProperty("status", "Alive");
		c.addProperty("species", "Human");
		c.addProperty("gender", "Male");
		
		try(FileWriter out = new FileWriter("manual.json")){
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			gson.toJson(c, out);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
