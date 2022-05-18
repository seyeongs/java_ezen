package javaCollectionFramework;

public class ListVectorBoard {
	String subject;
	String content;
	String writer;
	
	public ListVectorBoard(String subject, String content, String writer) {
		this.content = content;
		this.subject = subject;
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "ListVectorBoard [subject=" + subject + ", content=" + content + ", writer=" + writer + "]";
	}
}
