package minitest.service.impl;

import minitest.model.Category;
import minitest.model.Product;
import minitest.repository.IProductRepository;
import minitest.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public Iterable<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return iProductRepository.findById(id);
    }

    @Override
    public Product save(Product product) {
       return iProductRepository.save(product);
    }

    @Override
    public void delete(Long id) {
        iProductRepository.deleteById(id);
    }

    @Override
    public Iterable<Product> findAllByName(String name) {
        return iProductRepository.findAllByNameContaining(name);
    }

    @Override
    public Page<Product> findPage(Pageable pageable) {
        return iProductRepository.findAll(pageable);
    }


}
