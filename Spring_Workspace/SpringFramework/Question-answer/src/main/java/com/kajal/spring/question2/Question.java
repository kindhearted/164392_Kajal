package com.kajal.spring.question2;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	
	private int questionId;
	private String question;
	private List<String> answerList;
	private Set<String> answerSet;
	private Map<Integer,String> answerMap;
	
	
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswerList() {
		return answerList;
	}
	public void setAnswerList(List<String> answerList) {
		this.answerList = answerList;
	}
	public Set<String> getAnswerSet() {
		return answerSet;
	}
	public void setAnswerSet(Set<String> answerSet) {
		this.answerSet = answerSet;
	}
	public Map<Integer, String> getAnswerMap() {
		return answerMap;
	}
	public void setAnswerMap(Map<Integer, String> answerMap) {
		this.answerMap = answerMap;
	}
	
	
	
	public void showQuestionList()
	{
		System.out.println("Question Id : "+questionId);
		System.out.println("Question is : "+question);
		System.out.println("Options are : ");
		
		Iterator<String> iterator = answerList.iterator();
		while (iterator.hasNext()) 
		{
			System.out.println("		"+iterator.next());
		}
	}
	
	
	public void showQuestionSet()
	{
		System.out.println("Question Id : "+questionId);
		System.out.println("Question is : "+question);
		System.out.println("Options are : ");
		
		Iterator<String> iterator = answerSet.iterator();
		while (iterator.hasNext()) 
		{
			System.out.println("		"+iterator.next());
		}
	}
	
	
	public void showQuestionMap()
	{
		System.out.println("Question Id : "+questionId);
		System.out.println("Question is : "+question);
		System.out.println("Options are : ");
		
	for (Entry<Integer, String> entry : answerMap.entrySet()) {
		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
	}
}
	


