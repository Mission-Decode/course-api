package io.myspringproject.springbootstarter.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getAllTopics(){
		List<Topic> topics  = new ArrayList();
		Iterator<Topic> iterator = topicRepository.findAll().iterator();
		while(iterator.hasNext()){
			Topic t = (Topic) iterator.next();
			topics.add(t);
		}
		return topics;
	}
	
	public Topic getTopic(String id){
		return topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(Topic topic, String id) {
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepository.delete(id);
	}
}
