package co.sqasa.task;

import co.sqasa.userinterfaces.NotepadPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class VerificarNota implements Task {

    @Override
    @Step("{0} verifica que la nota se crea correctamente con texto en negrita")
    public <T extends Actor> void performAs(T actor) {
        String textoNotaEnNegrita = Text.of(NotepadPage.NOTA_RESULTANTE)
                .viewedBy(actor)
                .asString();
    }

    public static VerificarNota correctamente() {
        return instrumented(VerificarNota.class);
    }
}