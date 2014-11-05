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
 * Author model.
 * @author Zoey76
 */
public class Author
{
	/** Author's name. */
	private String _name;
	/** Auhtor's e-mail. */
	private String _email;
	/** Author's URI. */
	private String _uri;
	
	/**
	 * Gets the name.
	 * @return the name
	 */
	public String getName()
	{
		return _name;
	}
	
	/**
	 * Sets the name.
	 * @param name the name
	 */
	public void setName(String name)
	{
		_name = name;
	}
	
	/**
	 * Gets the e-mail.
	 * @return the e-mail
	 */
	public String getEmail()
	{
		return _email;
	}
	
	/**
	 * Sets the e-mail
	 * @param email the e-mail
	 */
	public void setEmail(String email)
	{
		_email = email;
	}
	
	/**
	 * Gets the URI.
	 * @return the URI
	 */
	public String getUri()
	{
		return _uri;
	}
	
	/**
	 * Sets the URI.
	 * @param uri the URI
	 */
	public void setUri(String uri)
	{
		_uri = uri;
	}
}
