package az.elvinali.redis;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductDao productDao;

    @PostMapping
    public Product save(@RequestBody Product product) {
        return productDao.save(product);
    }

    @GetMapping
    public List<Product> getAll() {
        return productDao.findAll();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable Long id) {
        return productDao.findById(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        return productDao.deleteProduct(id);
    }


}
