package com.mycompany.atividadeavaliativa4pt2;

import aplicacao.Pilha;
import exceptions.ExcecaoPilhaVazia;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class PrimaryController {

    Pilha pilha = new Pilha<>();

    @FXML
    private TextField textoInsere;

    @FXML
    private TextField textoRetira;

    private List<String> lista = new ArrayList<>();

    @FXML
    private ListView<Object> listview;

    @FXML
    private ObservableList<Object> obslistview;

    public PrimaryController() {
        Pilha pilha = new Pilha();

    }

    @FXML
    private void empilha() {
        pilha.push(textoInsere.getText());
        lista.add(textoInsere.getText());
        obslistview = FXCollections.observableArrayList(lista);
        listview.setItems(obslistview);
    }

    @FXML
    private void desempilha() throws ExcecaoPilhaVazia {

        try {
            textoRetira.setText((String) pilha.topo());
            lista.remove(pilha.pop());
            obslistview = FXCollections.observableArrayList(lista);
            listview.setItems(obslistview);
        } catch (ExcecaoPilhaVazia e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText("");
            alerta.setContentText(e.getMessage());
            alerta.showAndWait();
    
        }
    }

}
