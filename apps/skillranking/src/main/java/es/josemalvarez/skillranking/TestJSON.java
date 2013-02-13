package es.josemalvarez.skillranking;



import static org.junit.Assert.assertEquals;

import java.io.InputStream;

import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

import org.apache.commons.io.IOUtils;

import com.google.gson.JsonParser;



public class TestJSON {

	  public static void main(String[] args) throws Exception {
	        InputStream is = 
	                Thread.currentThread().getContextClassLoader().getResourceAsStream("data/connections-full.json");
	        String jsonTxt = IOUtils.toString( is );
	        is.close();
	        JSONObject json = (JSONObject) JSONSerializer.toJSON( jsonTxt );
	        System.out.println(json.get("_count"));
	   }
}
