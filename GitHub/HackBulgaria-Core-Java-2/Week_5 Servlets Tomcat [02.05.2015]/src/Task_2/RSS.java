package Task_2;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;

/**
 * Servlet implementation class RSS
 */
@WebServlet("/RSS")
public class RSS extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RSS()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter writer = response.getWriter();

		URL url = new URL("http://www.sportal.bg/uploads/rss_category_2.xml");
		HttpURLConnection httpcon = (HttpURLConnection) url.openConnection();
		// Reading the feed

		try
		{
			SyndFeedInput input = new SyndFeedInput();
			SyndFeed feed;
			feed = input.build(new XmlReader(httpcon));
			List<SyndEntry> entries = feed.getEntries();
			Iterator<SyndEntry> itEntries = entries.iterator();
			while (itEntries.hasNext())
			{
				SyndEntry entry = itEntries.next();
				System.out.println("Title: " + entry.getTitle());
				System.out.println("Link: " + entry.getLink());
				System.out.println("Author: " + entry.getAuthor());
				System.out.println("Publish Date: " + entry.getPublishedDate());
				System.out.println("Description: " + entry.getDescription().getValue());
				System.out.println();
			}
		}
		catch (IllegalArgumentException | FeedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
	}
}
