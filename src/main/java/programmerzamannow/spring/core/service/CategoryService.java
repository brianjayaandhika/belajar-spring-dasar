package programmerzamannow.spring.core.service;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import programmerzamannow.spring.core.repository.CategoryRepository;


//@Scope("prototype")
//@Lazy
@Component
public class CategoryService {

    @Getter
    private CategoryRepository categoryRepository;

    @Autowired
    public void setCategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
}
