package com.ecommerce.Ecommerce.service;

import com.ecommerce.Ecommerce.model.Category;
import com.ecommerce.Ecommerce.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryRepo categoryRepo;
    public void createCategory(Category category) {
        categoryRepo.save(category);
    }
        public List<Category> listCategory() {
           return categoryRepo.findAll();

        }

    public void editCategry(int categoryId, Category updatecategory) {
        Category category =categoryRepo.getById(categoryId);
        category.setCategoryName(updatecategory.getCategoryName());
        category.setDescription(updatecategory.getDescription());
        category.setImageUrl(updatecategory.getImageUrl());
        categoryRepo.save(category);
    }

    public boolean findById(int categoryId) {
        return categoryRepo.findById(categoryId).isPresent();

    }
}
