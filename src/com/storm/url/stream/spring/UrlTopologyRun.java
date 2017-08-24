package com.storm.url.stream.spring;

import org.apache.storm.Config;
import org.apache.storm.LocalCluster;
import org.apache.storm.scheduler.Cluster;
import org.apache.storm.topology.TopologyBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.logging.*;

public class UrlTopologyRun {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		UrlTopologyspring uts = (UrlTopologyspring) context.getBean("UrlTopologyspring");
		uts.buildTopology("SpringTopology","SpringSpout","SpringBolt");

	}
}
