package co.sqasa.task;

import co.sqasa.userinterfaces.NotepadPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CrearNota implements Task {

    private final String textoNota;

    public CrearNota(String textoNota) {
        this.textoNota = textoNota;
    }

    @Override
    @Step("{0} crea una nueva nota con texto en negrita")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(textoNota).into(NotepadPage.EDITABLE_TEXT_AREA),
                Click.on(NotepadPage.BOLD_BUTTON),
                Click.on(NotepadPage.SAVE_BUTTON)
        );
    }

    public static CrearNota conTextoEnNegrita(String textoNota) {
        return instrumented(CrearNota.class, textoNota);
    }
}
