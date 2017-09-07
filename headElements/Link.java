package headElements;

import java.util.ArrayList;

public class Link extends HeadElement {

	public static String[] linkAttributes = {"charset", "crossorigin", "href", "hreflang", "media", "rel", "rev", "sizes", "target", "type"};
	public String charset = "";
	public String crossorigin = "";
	public String href = "";
	public String hreflang = "";
	public String media = "";
	public String rel = "";
	public String[] relType = {"alternate", "author", "dns-prefetch", "help", "icon", "license", "next", "pingback", "preconnect", "prefetch", "preload", "prerender", "prev", "search"};
	public String rev = "";
	public String sizes = "";
	public String target = "";
	public String type = "";
	
	public Link(ArrayList<String> attributes) {
		super();
		this.elementName = "Link";
//		System.out.println("Creating LINK with ATTRIBUTES "+attributes);
		this.attributes = attributes;
	}
	

}
