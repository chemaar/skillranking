package es.josemalvarez.skillranking;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;

import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

public class NaiveConnectionsParser {

	@Test
	public void test() throws IOException {
		  InputStream is = 
	                Thread.currentThread().getContextClassLoader().getResourceAsStream("data/connections-10.json");
	        String jsonTxt = IOUtils.toString( is );
	        is.close();
	        JSONObject json = (JSONObject) JSONSerializer.toJSON( jsonTxt );
	        assertEquals(10,json.get("_count"));        
	}

}
