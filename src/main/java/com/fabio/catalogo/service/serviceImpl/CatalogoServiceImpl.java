package com.fabio.catalogo.service.serviceImpl;

import java.util.List;

import com.fabio.catalogo.model.Musica;
import com.fabio.catalogo.repository.CatalogoRepository;
import com.fabio.catalogo.service.CatalogoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogoServiceImpl implements CatalogoService {

    @Autowired
    CatalogoRepository catalogoRepository;

    @Override
    public List<Musica> findAll() {
        return catalogoRepository.findAll();
    }

    @Override
    public Musica findById(long id) {
        return catalogoRepository.findById(id).get();
    }

    @Override
    public Musica save(Musica musica) {
        return catalogoRepository.save(musica);
    }
    
    @Override
    public void delete(long id) {
        Musica musica = catalogoRepository.findById(id).get();
        catalogoRepository.delete(musica);
    }

    @Override
    public void update(Musica musica) {
        catalogoRepository.save(musica);
    }
}