/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.facture;

import ejb.facture.ClientFacade;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import jpa.facture.Client;

/**
 *
 * @author Alfa Waro
 */
@Named(value = "clientBean")
@ViewScoped
public class ClientBean implements Serializable {

    @EJB
    private ClientFacade clientFacade;
    private Client newClient;
    private List<Client> listClients;
    private Client selectedClient;

    public ClientBean() {
    }

    @PostConstruct
    public void init() {
        listClients = clientFacade.findAll();
        newClient = new Client();

    }

    public void saveClient() {
        listClients = clientFacade.findAll();
        newClient = new Client();
        clientFacade.create(newClient);
    }

    public void editClient(ActionEvent event) {
        clientFacade.edit(selectedClient);
        listClients = clientFacade.findAll();
    }

    public void removeClient(ActionEvent event) {
        clientFacade.remove(selectedClient);
        listClients = clientFacade.findAll();
    }

    public ClientFacade getClientFacade() {
        return clientFacade;
    }

    public void setClientFacade(ClientFacade clientFacade) {
        this.clientFacade = clientFacade;
    }

    public Client getNewClient() {
        return newClient;
    }

    public void setNewClient(Client newClient) {
        this.newClient = newClient;
    }

    public List<Client> getListClients() {
        return listClients;
    }

    public void setListClients(List<Client> listClients) {
        this.listClients = listClients;
    }

    public Client getSelectedClient() {
        return selectedClient;
    }

    public void setSelectedClient(Client selectedClient) {
        this.selectedClient = selectedClient;
    }

}
