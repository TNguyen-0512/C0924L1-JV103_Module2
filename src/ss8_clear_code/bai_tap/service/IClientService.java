package ss8_clear_code.bai_tap.service;

import ss8_clear_code.bai_tap.model.Client;

import java.time.LocalDate;

public interface IClientService {
    Client[] findAll();
    void addClient(Client client);
    boolean updateClient(int id, String name, LocalDate birthday,String address);
    boolean deleteClient(int id);
}
