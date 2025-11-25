// language: java
package com.uclient.uclientpoint;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    private final List<Client> clientes = new ArrayList<>();
    private long nextId = 1;

    @GetMapping
    public List<Client> lsTodosClientes() {
        return clientes;
    }

    @GetMapping("/{id}")
    public Client buscarPorId(@PathVariable Long id) {
        for (Client c : clientes) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }

    @PostMapping
    public Client criarCliente(@RequestBody Client novo) {
        novo.setId(nextId++);
        clientes.add(novo);
        return novo;
    }

    @PutMapping("/{id}")
    public Client atualizarCliente(@PathVariable Long id, @RequestBody Client atualizado) {
        Client existente = buscarPorId(id);
        if (existente != null) {
            existente.setCPF(atualizado.getCPF());
            existente.setCEP(atualizado.getCEP());
            existente.setUser(atualizado.getUser());
            existente.setPassword(atualizado.getPassword());
        }
        return existente;
    }

    @DeleteMapping("/{id}")
    public void removerCliente(@PathVariable Long id) {
        for (Iterator<Client> it = clientes.iterator(); it.hasNext(); ) {
            if (it.next().getId().equals(id)) {
                it.remove();
                break;
            }
        }
    }
}
