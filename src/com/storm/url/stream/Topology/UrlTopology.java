package com.storm.url.stream.Topology;
import org.apache.storm.Config;
import org.apache.storm.LocalCluster;
import org.apache.storm.topology.TopologyBuilder;
import org.apache.storm.utils.Utils;

import com.storm.url.stream.Bolts.*;
import com.storm.url.stream.spouts.*;

public class UrlTopology {
	private TopologyBuilder builder;

	public static void main(String[] args) {
		
		TopologyBuilder builder = new TopologyBuilder();
	
		/*	Spout and Bolt to Stream INFY SHARES*/
		/*builder.setSpout("Googlespout", new UrlSpout());
		builder.setBolt("Googlebolt", new UrlBolt()).shuffleGrouping("Googlespout");
		*/
		/*	Spout and Bolt to Stream HDFC SHARES  */		
		/*builder.setSpout("HDFC_Spout",new HDFC_Spout());
		builder.setBolt("HDFC_Bolt",new HDFC_Bolt()).shuffleGrouping("HDFC_Spout");
		*/
		/*	Spout and Bolt to Stream  SHARES*/
		builder.setSpout("AUROPHARMA_Spout",new AUROPHARMA_Spout());
		builder.setBolt("AUROPHARMAS_Bolt",new AUROPHARMA_Bolt()).shuffleGrouping("AUROPHARMA_Spout");
		builder.setBolt("Write_Bolt", new Write_Bolt()).shuffleGrouping("AUROPHARMAS_Bolt");
	
		Config conf = new Config();
		//conf.setDebug(true);
		//conf.setNumWorkers(2);
		
		LocalCluster cluster = new LocalCluster();
		cluster.submitTopology("URLtopology", conf, builder.createTopology());
		Utils.sleep(50000);
		
		
		/* TO BUILD AN RUN ANOTHER TOPOLOGY 
		builder.setSpout("AUROPHARMAspout", new UrlSpout());
		builder.setBolt("AUROPHARMAbolt", new UrlBolt()).shuffleGrouping("AUROPHARMAspout");
		cluster.submitTopology("AUROPHARMATopology",conf,builder.createTopology());*/
		
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		cluster.killTopology("URLtopology");
		System.out.println("Cluster topoloy kill ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		cluster.shutdown();
		
	}

}
