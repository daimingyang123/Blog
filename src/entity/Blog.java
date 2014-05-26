package entity;

import java.util.Date;

public class Blog {

	// Fields

	private int id;
	private int viewCount;
	private String title;
	private String content;
	private String path;
	private String blogAbstract;
	private String fullPath;
	public int getViewCount() {
		return viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	public String getFullPath() {
		return fullPath;
	}

	public void setFullPath(String fullPath) {
		this.fullPath = fullPath;
	}


	private java.util.Date postDate;


	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}


	public String getBlogAbstract() {
		return blogAbstract;
	}

	public void setBlogAbstract(String blogAbstract) {
		this.blogAbstract = blogAbstract;
	}

	public Date getPostDate() {
		return this.postDate;
	}

	public void setPostDate(Date now) {
		this.postDate = now;
	}


}