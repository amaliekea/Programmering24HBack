package org.example.programmering24h.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//@DataJpaTest bruger altid h2 database så bruges typisk hvis test skal køre på github eller via github actions
@SpringBootTest

public class xklasseTest {

    //@Autowired
    //RegionRepository regionRepository;

    //dette kalder erik en integrationstest
//    @Test
//    void test5Regioner() {
//        List<Region> regions = regionRepository.findAll();
//        assertEquals(7, regions.size());
//    }

}
