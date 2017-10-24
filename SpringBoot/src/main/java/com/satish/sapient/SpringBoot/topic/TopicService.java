package com.satish.sapient.SpringBoot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList(new Topic("id1", "name1", "d1"), new Topic("id2", "name2", "d2"));

	public List<Topic> getAllTopics() {
		return topics;

	}
	
	public Topic getTopic( String id) {

		return new Topic("id1", "name1", "d1");
		
	}

	public void addTopic() {
		// TODO Auto-generated method stub
		
	}

}
