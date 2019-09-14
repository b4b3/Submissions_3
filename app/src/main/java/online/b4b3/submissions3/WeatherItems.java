package online.b4b3.submissions3;

import org.json.JSONObject;

public class WeatherItems {

    private String title;
    private String posterpath;
    private String overview;
    private String originallanguage;

    public WeatherItems(JSONObject object) {
        try {

           // int id = object.getInt("id");
            String title = object.getString("title");
            String overview = object.getString("overview");
           // String posterpath = object.getString("poster_path");
            String originallanguage = object.getString("original_language");

           // this.id = id;
            this.posterpath = ("https://image.tmdb.org/t/p/original" + object.getString("poster_path"));
            //this.posterpath = posterpath;
            this.title = title;
            this.overview = overview;
            this.originallanguage = originallanguage;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPosterpath() {
        return posterpath;
    }

    public void setPosterpath(String poster_path) {
        this.posterpath = posterpath;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getOriginallanguage() {
        return originallanguage;
    }

    public void setOriginallanguage(String originallanguage) {
        this.originallanguage = originallanguage;
    }


}

