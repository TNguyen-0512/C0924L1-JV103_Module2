package ss8_clear_code.bai_tap.service;

import ss8_clear_code.bai_tap.model.Client;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ClientService implements IClientService {
    private static  Client[] clients = new Client[10];

    static {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        clients[0] = new Client(1, "Bùi Trung Nguyên", LocalDate.parse("05/12/2003", formatter), "Gia Lai");
        clients[1] = new Client(2, "Bùi Trung Nguyên", LocalDate.parse("05/12/2003", formatter), "Gia Lai");
        clients[2] = new Client(3, "Bùi Trung Nguyên", LocalDate.parse("05/12/2003", formatter), "Gia Lai");
    }

    @Override
    public Client[] findAll() {
        return clients;
    }
    @Override
    public void addClient(Client client) {
        for (int i = 0; i < clients.length; i++) {
            if (clients[i]==null) {
                clients[i] = client;
                break;
            }
        }
    }

    @Override
    public boolean updateClient(int id, String name, LocalDate birthday, String address) {
        for (Client clients : clients) {
            if (clients != null && clients.getId() == id) {
                clients.setName(name);
                clients.setBirthDate(birthday);
                clients.setAddress(address);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteClient(int id) {
        for (int i = 0; i < clients.length; i++) {
            if (clients[i] != null && clients[i].getId() == id) {
                clients[i] = null;
                return true;
            }
        }
        return false;
    }
}
