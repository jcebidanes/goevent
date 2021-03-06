/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gojava.goevent.event.event_api.repository;

import java.util.List;
import org.gojava.goevent.event.event_api.model.Evento;

/**
 *
 * @author filipe.portes
 */
public interface EventoRepository {

    void persist(Evento evento);
    
    Evento merge(Evento evento);

    void remove(Evento evento);
    
    List<Evento> findAll();
    
    Evento findById(Integer id);
    
}
