package com.example.projetfacturation.TestUnitaire;

import com.example.projetfacturation.Models.ClientModel;
import com.example.projetfacturation.Repository.ClientRepository;
import com.example.projetfacturation.Services.ClientServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class ClientServiceImplTest {

        @Mock
        private ClientRepository clientRepository;

        @InjectMocks
        private ClientServiceImpl clientService;

        @BeforeEach
        void setUp() {
            MockitoAnnotations.openMocks(this);
        }

        @Test
        void testGetListClients() {
            ClientModel client1 = new ClientModel();
            client1.setNom("Rania");
            client1.setEmail("rania@example.com");
            client1.setSiret("123456789");
            client1.setDateCreation(new Date());

            ClientModel client2 = new ClientModel();
            client1.setNom("Rania");
            client1.setEmail("rania@example.com");
            client1.setSiret("123456789");
            client1.setDateCreation(new Date());


            client1.setDateCreation(new Date());

            List<ClientModel> mockClients = Arrays.asList(client1, client2);
            when(clientRepository.findAll()).thenReturn(mockClients);
            List<ClientModel> clients = clientService.getListClients();

            assertNotNull(clients);
            assertEquals(2, clients.size());
        }
    }
