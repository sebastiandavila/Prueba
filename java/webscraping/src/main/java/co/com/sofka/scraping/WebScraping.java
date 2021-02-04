package co.com.sofka.scraping;

import co.com.sofka.scraping.scraper.Extractors;
import co.com.sofka.scraping.state.ModelState;

public interface WebScraping {
    Extractors build(ModelState modelState);
}
