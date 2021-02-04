package co.com.sofka.scraping.selector;

import co.com.sofka.scraping.Selector;
import co.com.sofka.scraping.state.ModelState;
import org.jsoup.nodes.Element;


public class HtmlSelector implements Selector<Element> {
    @Override
    public void accept(ModelState modelState, Element element) {
        modelState.setMetaModel(null)
                .putExtra(label, element.html());
    }
}
