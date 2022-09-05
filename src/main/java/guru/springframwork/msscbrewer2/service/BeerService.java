package guru.springframwork.msscbrewer2.service;

import guru.springframwork.msscbrewer2.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
