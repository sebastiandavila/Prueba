package co.com.sofka.scraping.scraper;


import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MetaModel  implements Serializable {
    private final String type;
    private final String action;
    private final String method;
    private String path;
    private String query;
    private String selector;
    private Map<String, String> data;
    private Map<String, String> header;


    public MetaModel(String type, String action, String method) {
        this.data = new HashMap<>();
        this.header = new HashMap<>();
        this.path = "";
        this.query = "";
        this.selector = "";
        this.action = action;
        this.method = method;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getAction() {
        return action + getPath() + getQuery();
    }

    public Map<String, String> getData() {
        return data;
    }

    protected void setData(Map<String, String> data) {
        this.data = data;
    }

    public Map<String, String> getHeader() {
        return header;
    }

    protected void setHeader(Map<String, String> header) {
        this.header = header;
    }

    public String getMethod() {
        return method;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        Optional.ofNullable(query)
                .filter(q -> !"".equals(q))
                .ifPresent(q ->
                        this.query = "?" + query.replace("?", "")
                );

    }

    public String getSelector() {
        return Optional.of(selector)
                .filter(q -> !"".equals(q))
                .orElse("body");
    }

    public void setSelector(String selector) {
        this.selector = selector;
    }

    @Override
    public String toString() {
        return String.format("%s[%s]:%s --> %s", getMethod(), getAction(), getType(), getSelector());
    }
}
