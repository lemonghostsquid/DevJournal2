import java.net.*;
import java.io.*;
/**
 * A class that can read the contents of http://www.scp-wiki.net/.
 * @author Lennon Shitara
 */
public class URLReader
{

    /**
     * Constructor for objects of class URLReader
     */
    public static void main(String[] args) throws Exception
    {
        URL scpwiki = new URL("http://www.scp-wiki.net/");
        BufferedReader in = new BufferedReader(new InputStreamReader(scpwiki.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null){
            System.out.println(inputLine);
        }
        in.close();
    }

}
