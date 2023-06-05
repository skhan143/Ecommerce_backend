package com.ecommerce.Ecommerce.controller;

import com.ecommerce.Ecommerce.common.ApiResponse;
import com.ecommerce.Ecommerce.model.Category;
import com.ecommerce.Ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping("/create")
    public ResponseEntity<ApiResponse> createCategory(@RequestBody Category category){
        categoryService.createCategory(category);
        return new ResponseEntity(new ApiResponse( true, "A new category created"), HttpStatus.CREATED);
    }
    @GetMapping("/list")
    public List<Category> listCategory(){
       return categoryService.listCategory();
    }
    @PostMapping("/update/{categoryId}")
    public ResponseEntity<ApiResponse> updatCategory(@PathVariable("categoryId") int categoryId, @RequestBody Category category){
       System.out.println("category id " + categoryId);
       if (!categoryService.findById(categoryId)) {
           return new ResponseEntity<ApiResponse>(new ApiResponse( false, "category does not exist"), HttpStatus.NOT_FOUND);
       }
       categoryService.editCategry(categoryId, category);
        return new ResponseEntity<ApiResponse>(new ApiResponse( true, "category has been updated"), HttpStatus.OK);
    }
}
