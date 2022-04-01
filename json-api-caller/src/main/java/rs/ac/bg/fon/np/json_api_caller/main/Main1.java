package rs.ac.bg.fon.np.json_api_caller.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import rs.ac.bg.fon.np.json_api_caller.domain.Character; 

public class Main1 {

	public static String BASE_URL = "https://rickandmortyapi.com/api";
	public static String ADDITIONAL_ROUTE = "/character";
	public static String PARAMETER = "/2";

	public static void main(String[] args) {
		try {
			URL url = new URL(BASE_URL + ADDITIONAL_ROUTE + PARAMETER);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

			Gson gson = new GsonBuilder().create();
			Character result = gson.fromJson(in, Character.class);
			
			System.out.println(result);
			
			in.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
