package co.com.sofka.scraping.selector;

import co.com.sofka.scraping.Selector;
import co.com.sofka.scraping.state.ModelState;
import org.jsoup.nodes.Element;


public class TextSelector implements Selector<Element> {
    @Override
    public void accept(String label, ModelState modelState) {
        modelState.setMetaModel(null)
                .putExtra(label, element.text());
    }
}
