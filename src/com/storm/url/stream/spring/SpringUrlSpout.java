package com.storm.url.stream.spring;
import java.util.Map;
import javax.inject.*;

import org.apache.storm.spout.SpoutOutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseRichSpout;
import org.apache.storm.tuple.Fields;
import org.apache.storm.tuple.Values;

public class SpringUrlSpout extends BaseRichSpout {
	
	private SpoutOutputCollector collector;
	private String url;
//	@Inject Provider<Values> values;
	private Values values;

	@Override
	public void nextTuple() {
		
	//	System.out.println("Url passed :"+url);
	
		collector.emit(new Values(new String(url)));
	//	collector.emit(values);
		
	}
	public Values getValues() {
		return values;
	}

	public void setValues(Values values) {
		this.values = values;
	}

	public SpoutOutputCollector getCollector() {
		return collector;
	}

	public void setCollector(SpoutOutputCollector collector) {
		this.collector = collector;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public void open(Map conf, TopologyContext context, SpoutOutputCollector outputcollector) {
		this.collector = outputcollector;
		
	}

	@Override
	public void declareOutputFields(OutputFieldsDeclarer declarer) {
		declarer.declare(new Fields("url"));

	}

}
