package br.com.marcelocbasilio.managecustomers.services;

import br.com.marcelocbasilio.managecustomers.dto.ClientDTO;
import br.com.marcelocbasilio.managecustomers.entities.Client;
import br.com.marcelocbasilio.managecustomers.repositories.ClientRepository;
import br.com.marcelocbasilio.managecustomers.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Optional<Client> result = repository.findById(id);
        Client client = result.orElseThrow(() -> new ResourceNotFoundException("Não existe cliente com ID informado!"));
        return new ClientDTO(client);
    }
}
