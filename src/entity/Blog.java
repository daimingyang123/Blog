package entity;

import java.sql.Timestamp;


/**
 * Blog entity. @author MyEclipse Persistence Tools
 */

public class Blog  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Integer userId;
     private String title;
     private String path;
     private String abstract_;
     private Integer replyCount;
     private Integer viewCount;
     private Timestamp postDate;


    // Constructors

    /** default constructor */
    public Blog() {
    }

	/** minimal constructor */
    public Blog(Integer userId, String title, String path, Integer replyCount, Integer viewCount, Timestamp postDate) {
        this.userId = userId;
        this.title = title;
        this.path = path;
        this.replyCount = replyCount;
        this.viewCount = viewCount;
        this.postDate = postDate;
    }
    
    /** full constructor */
    public Blog(Integer userId, String title, String path, String abstract_, Integer replyCount, Integer viewCount, Timestamp postDate) {
        this.userId = userId;
        this.title = title;
        this.path = path;
        this.abstract_ = abstract_;
        this.replyCount = replyCount;
        this.viewCount = viewCount;
        this.postDate = postDate;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getPath() {
        return this.path;
    }
    
    public void setPath(String path) {
        this.path = path;
    }

    public String getAbstract_() {
        return this.abstract_;
    }
    
    public void setAbstract_(String abstract_) {
        this.abstract_ = abstract_;
    }

    public Integer getReplyCount() {
        return this.replyCount;
    }
    
    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }

    public Integer getViewCount() {
        return this.viewCount;
    }
    
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Timestamp getPostDate() {
        return this.postDate;
    }
    
    public void setPostDate(Timestamp postDate) {
        this.postDate = postDate;
    }
   








}