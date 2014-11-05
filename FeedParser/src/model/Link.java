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
 * Link model.
 * @author Zoey76
 */
public class Link
{
	/** The relationship between the current document and the linked document. */
	private String _rel;
	/** The MIME type of the linked resource. */
	private String _type;
	/** The location (URL) of the external resource. */
	private String _href;
	
	/**
	 * Gets the relation.
	 * @return the relation
	 */
	public String getRel()
	{
		return _rel;
	}
	
	/**
	 * Sets the relation.
	 * @param rel the relation
	 */
	public void setRel(String rel)
	{
		_rel = rel;
	}
	
	/**
	 * Gets the type.
	 * @return the type
	 */
	public String getType()
	{
		return _type;
	}
	
	/**
	 * Sets the type.
	 * @param type the type
	 */
	public void setType(String type)
	{
		_type = type;
	}
	
	/**
	 * Gets the location.
	 * @return the location
	 */
	public String getHref()
	{
		return _href;
	}
	
	/**
	 * Sets the location.
	 * @param href the location
	 */
	public void setHref(String href)
	{
		_href = href;
	}
}
