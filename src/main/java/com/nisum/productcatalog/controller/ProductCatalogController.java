package com.nisum.productcatalog.controller;

import com.nisum.productcatalog.data.ProductDO;
import com.nisum.productcatalog.exception.CustomException;
import java.util.ArrayList;
import javax.ws.rs.POST;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * Created by yc04292 on 12/14/18.
 */
@RestController
public class ProductCatalogController {



@GetMapping("/products")
  public ResponseEntity<List<ProductDO>>  getProducts(){
  //ResponseEntity<List<ProductDO>>  responseEntity= new ResponseEntity<List<ProductDO>>();

  List<ProductDO> productDOList= new ArrayList<>();
  ProductDO productDO= new ProductDO();
  productDO.setProductID("123");
  productDOList.add(productDO);
  return new ResponseEntity<>(productDOList,HttpStatus.ACCEPTED);
  }

}
