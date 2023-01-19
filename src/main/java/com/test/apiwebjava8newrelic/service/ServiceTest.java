package com.test.apiwebjava8newrelic.service;

import com.newrelic.api.agent.Trace;
import com.test.apiwebjava8newrelic.model.Testes;
import com.test.apiwebjava8newrelic.repository.TesteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceTest {

    @Autowired
    TesteRepository repository;

    @Trace(dispatcher = true)
    public void test2() throws InterruptedException {

        for (long i = 0; i < 10; i++) {
            Testes teste = new Testes();
            teste.setDescricao("Teste " + i);
            repository.save(teste);
        }
        test3();
    }

    @Trace(dispatcher = true)
    public void test3() throws InterruptedException {
        for (long i = 0; i < 1; i++) {
            System.out.println(repository.findAll());
        }
        test4();
    }

    @Trace(dispatcher = true)
    public void test4() throws InterruptedException {
        Thread.sleep(10);
    }

}
