package com.example.kafka.kafkaservice.dao.jpa;

import com.example.kafka.kafkaservice.model.jpa.OrderDetails;
import com.example.kafka.kafkaservice.repo.jpa.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
@Primary
public class OrderDao implements OrderRepository {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void flush() {
        orderRepository.flush();
    }

    @Override
    public <S extends OrderDetails> S saveAndFlush(S entity) {
        return orderRepository.saveAndFlush(entity);
    }

    @Override
    public <S extends OrderDetails> List<S> saveAllAndFlush(Iterable<S> entities) {
        return orderRepository.saveAllAndFlush(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<OrderDetails> entities) {
        orderRepository.deleteAllInBatch(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {
        orderRepository.deleteAllByIdInBatch(integers);
    }

    @Override
    public void deleteAllInBatch() {
        orderRepository.deleteAllInBatch();
    }

    @Override
    @Deprecated
    public OrderDetails getOne(Integer integer) {
        return orderRepository.getOne(integer);
    }

    @Override
    @Deprecated
    public OrderDetails getById(Integer integer) {
        return orderRepository.getById(integer);
    }

    @Override
    @Deprecated
    public OrderDetails getReferenceById(Integer integer) {
        return orderRepository.getReferenceById(integer);
    }

    @Override
    public <S extends OrderDetails> Optional<S> findOne(Example<S> example) {
        return orderRepository.findOne(example);
    }

    @Override
    public <S extends OrderDetails> List<S> findAll(Example<S> example) {
        return orderRepository.findAll(example);
    }

    @Override
    public <S extends OrderDetails> List<S> findAll(Example<S> example, Sort sort) {
        return orderRepository.findAll(example, sort);
    }

    @Override
    public <S extends OrderDetails> Page<S> findAll(Example<S> example, Pageable pageable) {
        return orderRepository.findAll(example, pageable);
    }

    @Override
    public <S extends OrderDetails> long count(Example<S> example) {
        return orderRepository.count(example);
    }

    @Override
    public <S extends OrderDetails> boolean exists(Example<S> example) {
        return orderRepository.exists(example);
    }

    @Override
    public <S extends OrderDetails, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return orderRepository.findBy(example, queryFunction);
    }

    @Override
    public <S extends OrderDetails> S save(S entity) {
        return orderRepository.save(entity);
    }

    @Override
    public <S extends OrderDetails> List<S> saveAll(Iterable<S> entities) {
        return orderRepository.saveAll(entities);
    }

    @Override
    public Optional<OrderDetails> findById(Integer integer) {
        return orderRepository.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return orderRepository.existsById(integer);
    }

    @Override
    public List<OrderDetails> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public List<OrderDetails> findAllById(Iterable<Integer> integers) {
        return orderRepository.findAllById(integers);
    }

    @Override
    public long count() {
        return orderRepository.count();
    }

    @Override
    public void deleteById(Integer integer) {
        orderRepository.deleteById(integer);
    }

    @Override
    public void delete(OrderDetails entity) {
        orderRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {
        orderRepository.deleteAllById(integers);
    }

    @Override
    public void deleteAll(Iterable<? extends OrderDetails> entities) {
        orderRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        orderRepository.deleteAll();
    }

    @Override
    public List<OrderDetails> findAll(Sort sort) {
        return orderRepository.findAll(sort);
    }

    @Override
    public Page<OrderDetails> findAll(Pageable pageable) {
        return orderRepository.findAll(pageable);
    }
}
