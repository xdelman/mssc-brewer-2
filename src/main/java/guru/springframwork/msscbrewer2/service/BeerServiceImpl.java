package guru.springframwork.msscbrewer2.service;

import guru.springframwork.msscbrewer2.web.model.BeerDto;

import java.util.UUID;

public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Castle Lite")
                .beerStyle("Draught")
                .build();
    }
}
