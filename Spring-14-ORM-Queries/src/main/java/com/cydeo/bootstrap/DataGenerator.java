package com.cydeo.bootstrap;

import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;

public class DataGenerator implements CommandLineRunner {

    private final RegionRepository regionRepository;

    public DataGenerator(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        System.out.println("------------------REGION START--------------------");

        System.out.println("findByCountry:" + regionRepository.findByCountry("Canada"));
        System.out.println("findByDistinctByCountry:" + regionRepository.findDistinctByCountry("Canada"));
        System.out.println("findByCountryContaining:" + regionRepository.findByCountryContaining("United"));
        System.out.println("findByCountryContainingOrderByCountry:" + regionRepository.findByCountryContainingOrderByCountry("Asia"));
        System.out.println("findTop2ByCountry:" + regionRepository.findTop2ByCountry("canada"));







        System.out.println("------------------REGION END--------------------");

    }
}
