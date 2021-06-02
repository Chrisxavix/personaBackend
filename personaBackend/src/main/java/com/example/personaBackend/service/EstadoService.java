package com.example.personaBackend.service;

import com.example.personaBackend.model.Estado;
import com.example.personaBackend.repository.EstadoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EstadoService implements EstadoRepository {

    /* Crear una inyección sin necesidad de crear una instancia */
    @Autowired
    private EstadoRepository estadoRepository;

    /* Listará paises, estados, etc */
    @Override
    public List<Estado> findAll() {
        return estadoRepository.findAll();
    }

    /* Recibe el Id de país y retorna solo los estados de ese país */
    public List<Estado> findAllByCountry (Long id){
        List<Estado> estadosRespuesta= new ArrayList<>();
        /* Trae los estados del método .findAll */
        List<Estado> estados= estadoRepository.findAll();
        for (int i=0; i<estados.size(); i++) {
            if (estados.get(i).getPais().getId()==id) {
                estadosRespuesta.add(estados.get(i));
            }
        }
        return estadosRespuesta;
    }

    @Override
    public List<Estado> findAll(Sort sort) {
        return estadoRepository.findAll(sort);
    }



    /* Opcional */
    @Override
    public List<Estado> findAllById(Iterable<Long> ids) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Estado> List<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void flush() {
        // TODO Auto-generated method stub

    }

    @Override
    public <S extends Estado> S saveAndFlush(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Estado> entities) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteAllInBatch() {
        // TODO Auto-generated method stub

    }

    @Override
    public Estado getOne(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Estado> List<S> findAll(Example<S> example) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Estado> List<S> findAll(Example<S> example, Sort sort) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Page<Estado> findAll(Pageable pageable) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Estado> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<Estado> findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean existsById(Long id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(Estado entity) {
        estadoRepository.delete(entity);
    }

    @Override
    public void deleteAll(Iterable<? extends Estado> entities) {
        estadoRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        estadoRepository.deleteAll();
    }

    @Override
    public <S extends Estado> Optional<S> findOne(Example<S> example) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Estado> Page<S> findAll(Example<S> example, Pageable pageable) {
        return estadoRepository.findAll(example, pageable);
    }

    @Override
    public <S extends Estado> long count(Example<S> example) {
        return estadoRepository.count(example);
    }

    @Override
    public <S extends Estado> boolean exists(Example<S> example) {
        return estadoRepository.exists(example);
    }
}
