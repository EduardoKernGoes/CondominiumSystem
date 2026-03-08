package com.example.condominiumsystem;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;

import java.io.IOException;

public class MainController {

    @FXML
    private void abrirFormularioCadastro(){
        System.out.println("Abriu o formulário de cadastro");
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("cadastro-view.fxml"));

            Scene scene = new Scene(fxmlLoader.load());

            Stage stage = new Stage();
            stage.setTitle("Cadastrar Novo Morador");

            stage.initModality(Modality.APPLICATION_MODAL);

            scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());

            stage.setScene(scene);
            stage.show();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
