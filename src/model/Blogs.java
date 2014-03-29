package model;

import java.util.List;
import entity.Blog;

public class Blogs
{
    private String username;
    private int pageIndex = 1;
    private int everyPageCount = 10;
    private long count;
    private int pageCount;
    private List<Blog> blogs;
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}

	public int getPageIndex()
	{
		return pageIndex;
	}

	public void setPageIndex(int pageIndex)
	{ 
		this.pageIndex = pageIndex;
	}

	public int getPageCount()
	{
		return pageCount;
	}

	public void setPageCount(int pageCount)
	{
		this.pageCount = pageCount;
	}

	public List<Blog> getBlogs()
	{
		return blogs;
	}

	public void setBlogs(List<Blog> blogs)
	{
		this.blogs = blogs;
	}

	public long getCount()
	{
		return count;
	}

	public void setCount(long count)
	{
		this.count = count;
	}
	public int getEveryPageCount()
	{
		return everyPageCount;
	}
	public void setEveryPageCount(int everyPageCount)
	{
		this.everyPageCount = everyPageCount;
	}
}
