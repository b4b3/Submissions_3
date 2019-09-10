package online.b4b3.submissions3;

import org.json.JSONObject;

public class WeatherItems {
    private int id;
    private String title;
    private String poster_path;
    private String overview;
    private String original_language;

    public WeatherItems(JSONObject object) {
        try {

            int id = object.getJSONArray("results").getJSONObject(0).getInt("id");
            String title = object.getJSONArray("results").getJSONObject(0).getString("title");
            String overview = object.getJSONArray("results").getJSONObject(0).getString("overview");
            String poster_path = object.getJSONArray("results").getJSONObject(0).getString("poster_path");
            String original_language = object.getJSONArray("results").getJSONObject(0).getString("original_language");

            this.id = id;
            this.poster_path = poster_path;
            this.title = title;
            this.overview = overview;
            this.original_language = original_language;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }


}

