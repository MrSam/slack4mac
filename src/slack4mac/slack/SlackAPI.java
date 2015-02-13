package slack4mac.slack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.JTextField;


public class SlackAPI {

    
    
    private static String getMethod(String api_method) throws Exception {
        String url = "https://slack.com/api/" + api_method;
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();        
        con.setRequestMethod("GET");
                
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
 
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
 
        return response.toString();        
    }

    public static void authTest(String token) {
        // https://api.slack.com/methods/auth.test
    }

}
