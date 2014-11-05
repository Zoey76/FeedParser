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
import java.io.InputStream;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import model.Author;
import model.EntryFeed;
import model.Feed;
import model.Link;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/**
 * Feed Manager.
 * @author Zoey76
 */
public final class FeedParser
{
	/**
	 * Parses the feed.
	 * @param feeedUrl the feed URL
	 * @return the parsed feed
	 */
	public static Feed parseFeeds(String feeedUrl)
	{
		final Feed feed = new Feed();
		try
		{
			final URL url = new URL(feeedUrl);
			final InputStream is = url.openStream();
			final Document doc = getDocumentBuilder().parse(is);
			for (Node n = doc.getFirstChild().getFirstChild(); n != null; n = n.getNextSibling())
			{
				if ("title".equals(n.getNodeName()))
				{
					feed.setTitle(n.getTextContent());
				}
				else if ("subtitle".equals(n.getNodeName()))
				{
					feed.setSubTitle(n.getTextContent());
				}
				else if ("updated".equals(n.getNodeName()))
				{
					feed.setUpdated(n.getTextContent());
				}
				else if ("id".equals(n.getNodeName()))
				{
					feed.setId(n.getTextContent());
				}
				else if ("rights".equals(n.getNodeName()))
				{
					feed.setRights(n.getTextContent());
				}
				else if ("icon".equals(n.getNodeName()))
				{
					feed.setIcon(n.getTextContent());
				}
				else if ("logo".equals(n.getNodeName()))
				{
					feed.setLogo(n.getTextContent());
				}
				else if ("link".equals(n.getNodeName()))
				{
					final Link link = new Link();
					parseLink(link, n);
					feed.addLink(link);
				}
				else if ("author".equals(n.getNodeName()))
				{
					parseAuthor(feed.getAuthor(), n);
				}
				else if ("entry".equals(n.getNodeName()))
				{
					parseEntry(feed, n);
				}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return feed;
	}
	
	/**
	 * Parses the entry.
	 * @param node the node to parse
	 * @param feed the feed
	 */
	private static void parseEntry(Feed feed, Node node)
	{
		final EntryFeed entryFeed = new EntryFeed();
		for (Node n = node.getFirstChild(); n != null; n = n.getNextSibling())
		{
			if ("author".equals(n.getNodeName()))
			{
				parseAuthor(entryFeed.getAuthor(), n);
			}
			else if ("updated".equals(n.getNodeName()))
			{
				entryFeed.setUpdated(n.getTextContent());
			}
			else if ("published".equals(n.getNodeName()))
			{
				entryFeed.setPublished(n.getTextContent());
			}
			else if ("id".equals(n.getNodeName()))
			{
				entryFeed.setId(n.getTextContent());
			}
			else if ("link".equals(n.getNodeName()))
			{
				parseLink(entryFeed.getLink(), n);
			}
			else if ("title".equals(n.getNodeName()))
			{
				entryFeed.setTitle(n.getTextContent());
			}
			else if ("category".equals(n.getNodeName()))
			{
				final NamedNodeMap attrs = n.getAttributes();
				for (int i = 0; i < attrs.getLength(); i++)
				{
					final Node att = attrs.item(i);
					if ("term".equals(att.getNodeName()))
					{
						entryFeed.getCategory().setTerm(att.getNodeValue());
					}
					else if ("scheme".equals(att.getNodeName()))
					{
						entryFeed.getCategory().setScheme(att.getNodeValue());
					}
					else if ("label".equals(att.getNodeName()))
					{
						entryFeed.getCategory().setLabel(att.getNodeValue());
					}
				}
			}
			else if ("content".equals(n.getNodeName()))
			{
				entryFeed.setContent(n.getTextContent());
			}
		}
		feed.addEntry(entryFeed);
	}
	
	/**
	 * Parses the link.
	 * @param link the link
	 * @param node the node to parse
	 */
	private static void parseLink(Link link, Node node)
	{
		final NamedNodeMap attrs = node.getAttributes();
		for (int i = 0; i < attrs.getLength(); i++)
		{
			final Node att = attrs.item(i);
			if ("rel".equals(att.getNodeName()))
			{
				link.setRel(att.getNodeValue());
			}
			else if ("type".equals(att.getNodeName()))
			{
				link.setType(att.getNodeValue());
			}
			else if ("href".equals(att.getNodeName()))
			{
				link.setHref(att.getNodeValue());
			}
		}
	}
	
	/**
	 * Parses the author.
	 * @param author the author
	 * @param node the node to parse
	 */
	private static void parseAuthor(Author author, Node node)
	{
		if ("name".equals(node.getFirstChild().getNodeName()))
		{
			author.setName(node.getFirstChild().getTextContent());
		}
		else if ("email".equals(node.getFirstChild().getNodeName()))
		{
			author.setEmail(node.getFirstChild().getTextContent());
		}
		else if ("uri".equals(node.getFirstChild().getNodeName()))
		{
			author.setUri(node.getFirstChild().getTextContent());
		}
	}
	
	private static DocumentBuilder getDocumentBuilder()
	{
		final DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setValidating(false);
		dbf.setIgnoringComments(false);
		dbf.setIgnoringElementContentWhitespace(true);
		dbf.setNamespaceAware(true);
		dbf.setCoalescing(true);
		DocumentBuilder db = null;
		try
		{
			db = dbf.newDocumentBuilder();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return db;
	}
}
