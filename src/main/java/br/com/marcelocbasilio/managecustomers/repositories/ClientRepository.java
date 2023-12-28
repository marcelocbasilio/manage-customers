package br.com.marcelocbasilio.managecustomers.repositories;

import br.com.marcelocbasilio.managecustomers.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
