package co.com.sofka.scraping;

import co.com.sofka.scraping.scraper.MetaModel;
import org.jsoup.nodes.Document;

public interface DocumentPort {
    void connect(MetaModel model);

    void execute();

    Document parse();
}
