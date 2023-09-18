package co.sqasa.task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirPagina implements Task {

    private final String url;

    public AbrirPagina(String url) {
        this.url = url;
    }

    @Override
    @Step("{0} abre la página de notas")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(url)
        );
    }

    public static AbrirPagina deNotas(String url) {
        return instrumented(AbrirPagina.class, url);
    }
}
