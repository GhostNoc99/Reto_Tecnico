package co.sqasa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NotepadPage {
    public static final Target EDITABLE_TEXT_AREA = Target.the("área de texto editable")
            .located(By.id("editable"));

    public static final Target BOLD_BUTTON = Target.the("botón de negrita")
            .located(By.xpath("//button[@title='Bold']"));

    public static final Target SAVE_BUTTON = Target.the("botón de guardar")
            .located(By.id("save"));

    public static final Target NOTA_RESULTANTE = Target.the("nota resultante")
            .located(By.id("editable"));
}
