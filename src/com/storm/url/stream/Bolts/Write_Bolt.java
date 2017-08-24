package com.storm.url.stream.Bolts;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.util.Map;

import org.apache.storm.task.OutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseRichBolt;
import org.apache.storm.tuple.Fields;
import org.apache.storm.tuple.Tuple;
import org.apache.storm.utils.Utils;
import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.storm.json.GAPI_MAP;

public class Write_Bolt extends BaseRichBolt {

		private OutputCollector collector;
		private BufferedReader br;
		private JSONObject json;

		String data;

		@Override
		public void execute(Tuple tuple) {
			
			
			/*collector.emit(tuple, new Values(tuple.getString(0) + "!!!")); */
			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			System.out.println(tuple.getString(0)+","+timestamp+", wRITE_bOLT");
		    collector.ack(tuple);
			
		}

		@Override
		public void prepare(Map conf, TopologyContext context, OutputCollector outputcollector) {
			this.collector = outputcollector;

		}

		@Override
		public void declareOutputFields(OutputFieldsDeclarer declarer) {

			declarer.declare(new Fields("url"));
		}

		@Override
		public void cleanup() {
		}

		// mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
		// false);
		// mapper.configure(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER,
		// true );
		// mapper.configure(DeserializationConfig.FAIL_ON_UNKNOWN_PROPERTIES,
		// false);

	

	
	/*//List<String> lines = Arrays.asList("The first line", "The second line");
	String lines = obj.toString();
	Path file = Paths.get("c:\\temp\\stock2.txt");
	Files.write(file, lines, Charset.forName("UTF-8"));
	//Files.write(file, lines, Charset.forName("UTF-8"), StandardOpenOption.APPEND);
	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c:\\temp\\stock2.txt"));
	oos.writeObject(obj);*/
}


