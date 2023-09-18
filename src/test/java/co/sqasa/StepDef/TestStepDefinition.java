package co.sqasa.StepDef;

import co.sqasa.task.AbrirPagina;
import co.sqasa.task.CrearNota;
import co.sqasa.task.VerificarNota;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class TestStepDefinition {

    @Dado("que estoy en la página de notas")
    public void que_estoy_en_la_pagina_de_notas() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Usuario").attemptsTo(
                AbrirPagina.deNotas("https://www.online-notepad.net/es/bloc-de-notas-online")
        );
    }

    @Cuando("creo una nueva nota con texto en negrita")
    public void creo_una_nueva_nota_con_texto_en_negrita() {
        OnStage.theActorCalled("Usuario").attemptsTo(
                CrearNota.conTextoEnNegrita("Texto en negrita de prueba")
        );
    }

    @Entonces("la nota se crea correctamente con texto en negrita")
    public void la_nota_se_crea_correctamente_con_texto_en_negrita() {
        OnStage.theActorCalled("Usuario").attemptsTo(
                VerificarNota.correctamente()
        );
    }
}
