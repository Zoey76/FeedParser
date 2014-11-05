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
package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Auxiliary class.
 * @author Zoey76
 */
public final class Util
{
	/** Default date format MM-dd-yyyy HH:mm:ss. */
	public static final String DEFAULT_DATE_FORMAT = "MM-dd-yyyy HH:mm:ss";
	
	/**
	 * Formats a date in ISO8601 format as string to the specified format.
	 * @param date the date to format
	 * @param format the format
	 * @return the given date formatted
	 */
	public static String getFormattedDate(String date, String format)
	{
		if (date != null)
		{
			try
			{
				final Date d = ISO8601DateParser.parse(date);
				final SimpleDateFormat sdf = new SimpleDateFormat(format);
				return sdf.format(d);
			}
			catch (ParseException e)
			{
				e.printStackTrace();
			}
		}
		return null;
	}
	
	/**
	 * Formats a date in ISO8601 format as string to the default format {@link #DEFAULT_DATE_FORMAT}.
	 * @param date the date to format
	 * @return the given date formatted
	 */
	public static String getFormattedDate(String date)
	{
		return getFormattedDate(date, DEFAULT_DATE_FORMAT);
	}
}
