package es.josemalvarez.skillranking;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;

import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

public class NaiveJSONParser {

	@Test
	public void test() throws IOException {
		InputStream is =  Thread.currentThread().getContextClassLoader().getResourceAsStream( "naive.json");
        String jsonTxt = IOUtils.toString( is );
        is.close();
        JSONObject json = (JSONObject) JSONSerializer.toJSON( jsonTxt );        
        double coolness = json.getDouble( "coolness" );
        int altitude = json.getInt( "altitude" );
        JSONObject pilot = json.getJSONObject("pilot");
        String lastName = pilot.getString("lastName");
        assertEquals(39000, altitude);
        assertEquals("2.0",String.valueOf(coolness));
        assertEquals("Aldrin",lastName);        
	}

}
