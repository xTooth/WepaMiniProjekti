/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekti.services;

import java.util.List;

/**
 *
 * @author Toothy
 */
public interface DBService<T> {
    
    T findById(Long id);
    List<T> getAll();
    <S extends T> void save(S entity);
}
