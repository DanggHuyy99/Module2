package news.headline;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewsHeadLineExample {
    public static void main(String[] args) {
        String url = "https://www.24h.com.vn/";
        try {
            URL website = new URL(url);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(website.openStream()));
            StringBuilder stringBuilder = new StringBuilder();
            String inputLine;
            while ((inputLine = bufferedReader.readLine()) != null) {
                stringBuilder.append(inputLine);
            }
            bufferedReader.close();
            String html = stringBuilder.toString();
            Pattern pattern = Pattern.compile("<a\\s+href=\"(.*?)\".*?>(.*?)</a>");
            Matcher matcher = pattern.matcher(html);
            while (matcher.find()) {
                String link = matcher.group(1);
                String text = matcher.group(2);
                System.out.println(link + " - " + text);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

