/*
 * Feed Parser: ATOM object oriented feed parser.
 * Copyright (C) 2014 Zoey76
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package model;

/**
 * Entry feed model.
 * @author Zoey76
 */
public class EntryFeed
{
	/** The entry's author. */
	private final Author _author = new Author();
	/** The entry's last update date. */
	private String _updated;
	/** The entry's publish date. */
	private String _published;
	/** The entry's ID. */
	private String _id = "";
	/** The entry's link. */
	private final Link _link = new Link();
	/** The entry's title. */
	private String _title = "";
	/** The entry's category. */
	private final Category _category = new Category();
	/** The entry's content. */
	private String _content = "";
	
	/**
	 * Gets the entry's author.
	 * @return the author
	 */
	public Author getAuthor()
	{
		return _author;
	}
	
	/**
	 * Gets the entry's last update date.
	 * @return the last update date
	 */
	public String getUpdated()
	{
		return _updated;
	}
	
	/**
	 * Sets the entry's last update date.
	 * @param updated last update date
	 */
	public void setUpdated(String updated)
	{
		_updated = updated;
	}
	
	/**
	 * Gets the entry's published date.
	 * @return the published date
	 */
	public String getPublished()
	{
		return _published;
	}
	
	/**
	 * Sets the entry's published date.
	 * @param published the published date
	 */
	public void setPublished(String published)
	{
		_published = published;
	}
	
	/**
	 * Gets the entry's ID.
	 * @return the ID
	 */
	public String getId()
	{
		return _id;
	}
	
	/**
	 * Sets the entry's ID.
	 * @param id the ID
	 */
	public void setId(String id)
	{
		_id = id;
	}
	
	/**
	 * The entry's link.
	 * @return the link
	 */
	public Link getLink()
	{
		return _link;
	}
	
	/**
	 * Gets the entry's title.
	 * @return the title
	 */
	public String getTitle()
	{
		return _title;
	}
	
	/**
	 * Sets the entry's title.
	 * @param title the title
	 */
	public void setTitle(String title)
	{
		_title = title;
	}
	
	/**
	 * Gets the entry's category.
	 * @return the category
	 */
	public Category getCategory()
	{
		return _category;
	}
	
	/**
	 * Gets the entry's content.
	 * @return the content
	 */
	public String getContent()
	{
		return _content;
	}
	
	/**
	 * Sets the entry's content.
	 * @param content the content
	 */
	public void setContent(String content)
	{
		_content = content;
	}
}
