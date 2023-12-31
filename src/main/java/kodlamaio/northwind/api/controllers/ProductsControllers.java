package kodlamaio.northwind.api.controllers;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsControllers {
    public ProductsControllers(ProductService productService) {
        this.productService = productService;
    }

    @Autowired
    private ProductService productService;
    @GetMapping("/getall")
    public List<Product> getAll(){
        return (List<Product>) this.productService.getAll();
    }
}
