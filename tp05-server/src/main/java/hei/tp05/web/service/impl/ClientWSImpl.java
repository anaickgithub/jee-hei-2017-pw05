package hei.tp05.web.service.impl;

import hei.tp05.contract.dto.ClientDTO;
import hei.tp05.contract.facade.ClientWS;
import hei.tp05.core.entity.Client;
import hei.tp05.core.service.ClientService;

import javax.inject.Inject;
import javax.inject.Named;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anaïck on 31/01/2017.
 */
@Named("clientWS")
@WebService(endpointInterface = "hei.tp05.contract.facade.ClientWS")
public class ClientWSImpl extends ClientDTO implements ClientWS {

    @Inject
    private ClientService clientservice;

    @Override
    public List<ClientDTO> getAllClients(){
        final List<Client> clients = clientservice.findAll();
        List<ClientDTO> clientDTOS = new ArrayList<>();
        for(Client client:clients){
            ClientDTO dto = new ClientDTO(client.getNom(), client.getPrenom());
            clientDTOS.add(dto);
        }
        return clientDTOS;
    }

    @Override
    public void saveClient(ClientDTO client) {

    }
}
