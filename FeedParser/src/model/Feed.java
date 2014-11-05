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

import java.util.ArrayList;
import java.util.List;

/**
 * Feed model.
 * @author Zoey76
 */
public class Feed
{
	/** The feed's ID. */
	private String _id;
	/** The feed's title. */
	private String _title;
	/** The feed's subtitle. */
	private String _subTitle;
	/** The feed's links. */
	private final List<Link> _links = new ArrayList<>();
	/** The feed's entries. */
	private final List<EntryFeed> _entries = new ArrayList<>();
	/** The feed's copyright. */
	private String _rights;
	/** The feed's icon. */
	private String _icon;
	/** The feed's logo. */
	private String _logo;
	/** The feed's last update date. */
	private String _updated;
	/** The feed's author. */
	private final Author _author = new Author();
	
	/**
	 * Gets the feed ID.
	 * @return the ID
	 */
	public String getId()
	{
		return _id;
	}
	
	/**
	 * Sets the feed's ID.
	 * @param id the ID
	 */
	public void setId(String id)
	{
		_id = id;
	}
	
	/**
	 * Gets the feed's title.
	 * @return the title
	 */
	public String getTitle()
	{
		return _title;
	}
	
	/**
	 * Sets the feed's title.
	 * @param title the title
	 */
	public void setTitle(String title)
	{
		_title = title;
	}
	
	/**
	 * Gets the feed's subtitle.
	 * @return the subtitle
	 */
	public String getSubTitle()
	{
		return _subTitle;
	}
	
	/**
	 * Sets the feed's subtitle.
	 * @param subTitle the subtitle
	 */
	public void setSubTitle(String subTitle)
	{
		_subTitle = subTitle;
	}
	
	/**
	 * Gets the feed's links.
	 * @return the links
	 */
	public List<Link> getLinks()
	{
		return _links;
	}
	
	/**
	 * Adds a link to the feed.
	 * @param link the link
	 */
	public void addLink(Link link)
	{
		_links.add(link);
	}
	
	/**
	 * Gets the entries.
	 * @return the entries
	 */
	public List<EntryFeed> getEntries()
	{
		return _entries;
	}
	
	/**
	 * Adds an entry to the feed.
	 * @param entryFeed the entry
	 */
	public void addEntry(EntryFeed entryFeed)
	{
		_entries.add(entryFeed);
	}
	
	/**
	 * Gets the feed's copyrights.
	 * @return the rights
	 */
	public String getRights()
	{
		return _rights;
	}
	
	/**
	 * Sets the feed's copyrights.
	 * @param rights the copyrights
	 */
	public void setRights(String rights)
	{
		_rights = rights;
	}
	
	/**
	 * Gets the feed's icon.
	 * @return the icon
	 */
	public String getIcon()
	{
		return _icon;
	}
	
	/**
	 * Sets the feed's icon.
	 * @param icon the icon
	 */
	public void setIcon(String icon)
	{
		_icon = icon;
	}
	
	/**
	 * Gets the feed's logo.
	 * @return the logo
	 */
	public String getLogo()
	{
		return _logo;
	}
	
	/**
	 * Sets the feed logo.
	 * @param logo the logo
	 */
	public void setLogo(String logo)
	{
		_logo = logo;
	}
	
	/**
	 * Gets the feed's last update date.
	 * @return the last update date
	 */
	public String getUpdated()
	{
		return _updated;
	}
	
	/**
	 * Sets the feed's last update date.
	 * @param updated the last update date
	 */
	public void setUpdated(String updated)
	{
		_updated = updated;
	}
	
	/**
	 * Gets the feed's author.
	 * @return the author
	 */
	public Author getAuthor()
	{
		return _author;
	}
}
