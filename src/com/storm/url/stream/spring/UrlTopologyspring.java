package com.storm.url.stream.spring;

import org.apache.storm.Config;
import org.apache.storm.LocalCluster;
import org.apache.storm.topology.TopologyBuilder;
import org.springframework.*;
import org.springframework.beans.*;

public class UrlTopologyspring {
	private TopologyBuilder builder;
	private SpringUrlSpout urlspout;
	private SpringUrlBolt urlbolt;
	private Config config;
	private LocalCluster cluster;
	private String spoutName;
	private String boltName;
	private String topologyName;

	public void buildSpout(String SpoutName, SpringUrlSpout urlspout) {
		builder.setSpout(SpoutName, urlspout);
	}

	public void buildBolt(String boltName, SpringUrlBolt urlbolt, String SpoutName) {
		builder.setBolt(boltName, urlbolt).shuffleGrouping(SpoutName);
	}

	public void buildCluster(String topologyName, Config config) {

		cluster.submitTopology(topologyName, config, getBuilder().createTopology());
	}

	public void buildTopology(String topologyName,String spoutName,String boltName) 
	{
			
		builder.setSpout(spoutName, urlspout);
		builder.setBolt(boltName, urlbolt).shuffleGrouping(spoutName);
		cluster.submitTopology(topologyName, config, builder.createTopology());

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		cluster.killTopology(topologyName);
		cluster.shutdown();

	}

	public TopologyBuilder getBuilder() {
		return builder;
	}

	public void setBuilder(TopologyBuilder builder) {
		this.builder = builder;
	}

	public SpringUrlSpout getUrlspout() {
		return urlspout;
	}

	public void setUrlspout(SpringUrlSpout urlspout) {
		this.urlspout = urlspout;
	}

	public SpringUrlBolt getUrlbolt() {
		return urlbolt;
	}

	public void setUrlbolt(SpringUrlBolt urlbolt) {
		this.urlbolt = urlbolt;
	}

	public Config getConfig() {
		return config;
	}

	public void setConfig(Config config) {
		this.config = config;
	}

	public LocalCluster getCluster() {
		return cluster;
	}

	public void setCluster(LocalCluster cluster) {
		this.cluster = cluster;
	}

	public String getSpoutName() {
		return spoutName;
	}

	public void setSpoutName(String spoutName) {
		this.spoutName = spoutName;
	}

	public String getBoltName() {
		return boltName;
	}

	public void setBoltName(String boltName) {
		this.boltName = boltName;
	}

	public String getTopologyName() {
		return topologyName;
	}

	public void setTopologyName(String topologyName) {
		this.topologyName = topologyName;
	}

}
