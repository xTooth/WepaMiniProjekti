/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekti.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projekti.repositories.ImageRepository;
import projekti.types.FileObject;

/**
 *
 * @author Toothy
 */
@Service
public class ImageService implements DBService<FileObject>{

    @Autowired
    private ImageRepository repo;
    
    @Override
    public FileObject findById(Long id) {
        return repo.getOne(id);
    }

    @Override
    public List<FileObject> getAll() {
        return repo.findAll();
    }

    @Override
    public void save(FileObject f) {
        repo.save(f);
    }
    
}
