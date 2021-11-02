package springcorecodecollection;
import java.util.*;

public class Question {
	
	private int questionId;
	private String question;
	private List<String> answerlist;
	private Set<String> answerset;
	private Map<Integer,String> answermap;
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
	public List<String> getAnswerlist() {
		return answerlist;
	}
	public void setAnswerlist(List<String> answerlist) {
		this.answerlist = answerlist;
	}
	public Set<String> getAnswerset() {
		return answerset;
	}
	public void setAnswerset(Set<String> answerset) {
		this.answerset = answerset;
	}
	public Map<Integer, String> getAnswermap() {
		return answermap;
	}
	public void setAnswermap(Map<Integer, String> answermap) {
		this.answermap = answermap;
	}
	public Question(int questionId, String question, List<String> answerlist, Set<String> answerset,
			Map<Integer, String> answermap) {
	
		this.questionId = questionId;
		this.question = question;
		this.answerlist = answerlist;
		this.answerset = answerset;
		this.answermap = answermap;
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", \n answerlist=" + answerlist
				+ ", \nanswerset=" + answerset + ", \nanswermap=" + answermap + "]";
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	
	
}
