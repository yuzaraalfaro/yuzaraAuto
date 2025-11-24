package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import pages.homePage;
import utility.BrowserDriver;



public class loginStepDefinition {

    private WebDriver driver;
    private homePage HomePage;
    public loginStepDefinition() {
        this.driver = BrowserDriver.getDriver();
        this.HomePage = new homePage(driver); // Inicializar HomePage con el driver

    }

    //Scenario: Registro en la web

    @Given("estoy en la página de la tienda")
    public void estoy_en_la_pagina(){
      String titleMyStore = "My Store";
        Assert.assertEquals(titleMyStore,driver.getTitle());
    }
    @When("doy click en la opción iniciar sesion")
    public void ingreso_al_formulario_para_iniciar_sesion() {
        HomePage.clickLogin();
    }

    @When("doy click en el link text cree una cuenta aquí")
    public void ingreso_al_formulario_para_registrarme() {
        HomePage.clickRegister();
    }

    @When("lleno los campos del formulario para el registro")
    public void ingreso_datos_al_formulario() {
        HomePage.clickTratamiento();
        HomePage.registerFirstName("Yuzara");
        HomePage.registerLastName("Alfaro");
        HomePage.registerEmail("yuzara8@gmail.com");
        HomePage.registerPassword("yuzara123A");
        HomePage.registerBirthday("06/09/2000");
        HomePage.registerTC();
        HomePage.registerPrivacy();
        HomePage.registerSave();
    }

    @When("doy click en el botón guardar")
    public void click_guardar() {
        HomePage.registerSave();
    }



    @Then("debería visualizar mi usuario logeado en la pantalla")
    public void debería_mostrar_mi_usuario_en_inicio() {
        String actualUser = HomePage.encontrarUser();
        String expectedUser = "Iniciar sesión";
        Assert.assertTrue("El nombre del usuario no coincide. Se esperaba: " + expectedUser + " pero se obtuvo: " + actualUser,
                actualUser.equalsIgnoreCase(expectedUser));
    }








}
