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
 * Category model.
 * @author Zoey76
 */
public class Category
{
	/** The category's term. */
	private String _term;
	/** THe category's scheme. */
	private String _scheme;
	/** The category's label. */
	private String _label;
	
	/**
	 * Gets the category's term.
	 * @return the term
	 */
	public String getTerm()
	{
		return _term;
	}
	
	/**
	 * Sets the category's term.
	 * @param term the term
	 */
	public void setTerm(String term)
	{
		_term = term;
	}
	
	/**
	 * Gets the category's scheme.
	 * @return the scheme
	 */
	public String getScheme()
	{
		return _scheme;
	}
	
	/**
	 * Sets the category's scheme.
	 * @param scheme the scheme
	 */
	public void setScheme(String scheme)
	{
		_scheme = scheme;
	}
	
	/**
	 * Gets the category's label.
	 * @return the label
	 */
	public String getLabel()
	{
		return _label;
	}
	
	/**
	 * Sets the category's label.
	 * @param label the label
	 */
	public void setLabel(String label)
	{
		_label = label;
	}
}
