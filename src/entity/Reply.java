package entity;

import java.sql.Timestamp;

/**
 * Reply entity. @author MyEclipse Persistence Tools
 */

public class Reply implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer blogId;
	private String replyUserName;
	private Timestamp replyDate;
	private String replyFilename;

	// Constructors

	/** default constructor */
	public Reply() {
	}

	/** full constructor */
	public Reply(Integer blogId, String replyUserName, Timestamp replyDate,
			String replyFilename) {
		this.blogId = blogId;
		this.replyUserName = replyUserName;
		this.replyDate = replyDate;
		this.replyFilename = replyFilename;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBlogId() {
		return this.blogId;
	}

	public void setBlogId(Integer blogId) {
		this.blogId = blogId;
	}

	public String getReplyUserName() {
		return this.replyUserName;
	}

	public void setReplyUserName(String replyUserName) {
		this.replyUserName = replyUserName;
	}

	public Timestamp getReplyDate() {
		return this.replyDate;
	}

	public void setReplyDate(Timestamp replyDate) {
		this.replyDate = replyDate;
	}

	public String getReplyFilename() {
		return this.replyFilename;
	}

	public void setReplyFilename(String replyFilename) {
		this.replyFilename = replyFilename;
	}

}